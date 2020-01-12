package cl.servel.gasto.model;

import java.io.Serializable;

public class DefinicionActividad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer deaId;
	private Integer dtaId;
	private String deaCodigo;
	private String deaValor;
	private String deaDescripcion;
	private String deaCodigoActividad;

	public Integer getDeaId() {
		return deaId;
	}

	public void setDeaId(Integer deaId) {
		this.deaId = deaId;
	}

	public Integer getDtaId() {
		return dtaId;
	}

	public void setDtaId(Integer dtaId) {
		this.dtaId = dtaId;
	}

	public String getDeaCodigo() {
		return deaCodigo;
	}

	public void setDeaCodigo(String deaCodigo) {
		this.deaCodigo = deaCodigo;
	}

	public String getDeaValor() {
		return deaValor;
	}

	public void setDeaValor(String deaValor) {
		this.deaValor = deaValor;
	}

	public String getDeaDescripcion() {
		return deaDescripcion;
	}

	public void setDeaDescripcion(String deaDescripcion) {
		this.deaDescripcion = deaDescripcion;
	}

	public String getDeaCodigoActividad() {
		return deaCodigoActividad;
	}

	public void setDeaCodigoActividad(String deaCodigoActividad) {
		this.deaCodigoActividad = deaCodigoActividad;
	}

}
