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
public class Configuracion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer conId;
	private Integer idEveEventoEleccionario;
	private Integer idTpoEleccion;
	private Date created;
	private Date modified;
	private Boolean conEliminado;
	private String estado;
	private Integer idTpoEvento;
	private Boolean activo;
	private boolean estadoCarga;
	private String nombreTipoEvento;
	private String nombreTipoEleccion;
	private Integer dexId;

}
