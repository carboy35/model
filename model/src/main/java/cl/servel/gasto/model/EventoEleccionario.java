package cl.servel.gasto.model;

import java.util.Date;

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
public class EventoEleccionario implements java.io.Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static final String PARAM_EVENTO_HEADER = "idEvento";

	private int id;
	private int idTpoEvento;
	private String eveNombre;
	private Date eveFecha;
	private String eveEstado;
	private Date eveCreated;
	private Date eveModified;
	private Boolean eveEliminado;
	private Integer dexId;
	
}
