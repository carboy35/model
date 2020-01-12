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
public class EventoEleccionarioLiviano {

	private int id;
	private String nombre;
	private TipoEventoLiviano tipoEvento;
	private List<EleccionLiviano> elecciones;
}
