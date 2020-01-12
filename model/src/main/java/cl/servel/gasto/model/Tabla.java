package cl.servel.gasto.model;

import java.util.List;

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
public class Tabla<T> {

	private String id;
	private String tipo;
	private List<ListaColumnaTabla> columnas;
	private List<T> data;
}
