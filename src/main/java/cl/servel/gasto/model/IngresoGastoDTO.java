package cl.servel.gasto.model;

import java.io.Serializable;

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
public class IngresoGastoDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoRendicion;
	private String eleccion;
	private String territorio;
	private Sujeto sujeto;
	private String afiliacion;
	private String partido;
	private int rutProveedor;
	private String dvProveedor;
	private String nombreProveedor;
	private long fechaDocumento;
	private String tipoDocumento;
	private String descripcionTipoDocumento;
	private int tipoCuenta;
	private String descripcionCuenta;
	private String numeroDocumento;
	private String glosaDocumento;
	private double montoDocumento;
	private String region;

}
