package cl.servel.gasto.model;

import java.util.Date;
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
public class ReembolsoDTO<T> implements Cloneable {

	private Integer id;
	private Long idMandato;
	private Sujeto sujeto;
	private Sujeto sujetoOrigen;
	private int gastoEfectivo;
	private int remanenteDeterminado;
	private double monto;
	private String estado;
	private Date fecha;
	private Integer detalleNominaId;
	private long cantidadUF;
	private String cantidadUFTexto;
	private List<T> detalles;
	private Integer infId;
	private EleccionLiviano eleccion;
	private Long numeroCuenta;
	@Builder.Default
	private boolean poseeCuenta = true;
	@Builder.Default
	private String tipoMoneda = "CLP";

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
