package cl.servel.gasto.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Componente {

	private String tipo;
	private Map<String, String> data;
	private Map<String, List<String>> dataLista;
	private Map<String, List<Columnas>> columnas;
	private Map<String, List<DataColumna>> dataColumnas;
	private Map<String, List<DataColumnaCustom>> dataColumnasCustom;

}
