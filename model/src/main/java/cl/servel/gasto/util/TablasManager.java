package cl.servel.gasto.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import cl.servel.gasto.model.ColumnaTabla;
import cl.servel.gasto.model.ListaColumnaTabla;
import cl.servel.gasto.model.Tabla;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TablasManager {

	public static <T> Tabla<T> createTablaSimple(List<T> data) {

		Tabla<T> tabla = new Tabla<T>();

		tabla.setColumnas(createColumnas(data.get(0)));
		tabla.setData(data);

		return tabla;
	}

	@SuppressWarnings("unchecked")
	public static <T> Tabla<T> createTablaComplex(T dataParent) {

		Field[] fields = dataParent.getClass().getDeclaredFields();
		Tabla<T> tabla = new Tabla<T>();

		int sizeFieldChild = 0;

		for (Field field : fields) {
			field.setAccessible(true);
			if (field.getType().getCanonicalName().equalsIgnoreCase("java.util.List")) {

				List<T> data;
				try {
					data = (List<T>) field.get(dataParent);
					sizeFieldChild = data.get(0).getClass().getDeclaredFields().length;
					tabla.getColumnas().add(createColumnas(data.get(0)).get(0));
					tabla.setData(data);

				} catch (IllegalArgumentException | IllegalAccessException e) {
					log.info("Error al extraer datos de tabla compleja", e);
				}

			} else if (field.getType().getCanonicalName().equalsIgnoreCase("java.lang.String")) {

				List<ListaColumnaTabla> listaColumnas = new ArrayList<ListaColumnaTabla>();
				ListaColumnaTabla level0;
				try {
					level0 = ListaColumnaTabla.builder()
							.columnas(Arrays.asList(ColumnaTabla.builder()
									.nombre(arrayToString(split((String) field.get(dataParent)), " ", true)).rowspan("")
									.colspan(String.valueOf("")).build()))
							.build();

					listaColumnas.add(level0);

					tabla.setColumnas(listaColumnas);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					log.info("Error al extraer valor de field.");
				}

			}

		}

		tabla.getColumnas().get(0).getColumnas().get(0).setColspan(String.valueOf(sizeFieldChild));

		return tabla;
	}

	private static <T> List<ListaColumnaTabla> createColumnas(T data) {
		List<ListaColumnaTabla> listaColumnas = new ArrayList<ListaColumnaTabla>();
		Class clazz = data.getClass();

		Field[] fields = clazz.getDeclaredFields();

		List<ColumnaTabla> columnas = new ArrayList<ColumnaTabla>();

		for (Field field : fields) {
			columnas.add(ColumnaTabla.builder().nombre(arrayToString(split(field.getName()), " ", true)).rowspan("")
					.colspan("").build());
		}

		ListaColumnaTabla level1 = ListaColumnaTabla.builder().columnas(columnas).build();

		listaColumnas.add(level1);

		return listaColumnas;
	}

	public static List<String> split(String string) {

		List<String> splitted = new ArrayList<>(Arrays.asList(StringUtils.splitByCharacterTypeCamelCase(string)));
		splitted.removeAll(Collections.singleton("_"));

		return splitted;
	}

	public static String arrayToString(List<String> strings, String pattern, boolean upper) {

		StringBuilder newString = new StringBuilder();

		strings.forEach(s -> {
			newString.append((upper ? s.toUpperCase() : s) + pattern);
		});

		return newString.toString();
	}
}
