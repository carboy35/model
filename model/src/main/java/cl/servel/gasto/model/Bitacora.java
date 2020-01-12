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
public class Bitacora implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer bitId;
	private int eveEventoEleccionario;
	private int usuUsuarios;
	private String bitEntidadRegistrada;
	private long idEntidadRegistrada;
	private Date bitFechaRegistro;
	private String bitAccion;
	private String bitAtributoEntidad;
	private String bitValorRegistrado;

}
