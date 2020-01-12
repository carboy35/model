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
public class Eleccion implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8202261250782741185L;
	private Integer eleId;
	private Integer idEveEventoEleccionario;
	private Integer idTpoEleccion;
	private Integer idTpoEvento;
	private String idTpoNivel;
	private String eleCodigoOrigen;
	private String eleNombre;
	private Date eleFecha;
	private Boolean eleEliminado;
	private Date eleCreated;
	private Date eleModified;
	private boolean aplicaResumenCalculo;
	private boolean aplicaLimiteGasto;
}
