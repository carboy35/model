package cl.servel.gasto.model;

import java.io.Serializable;

public class Celula implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer celId;
	private Integer eveEventoEleccionario;
	private String celDescripcion;
	private boolean celActiva;

	public Integer getCelId() {
		return celId;
	}

	public void setCelId(Integer celId) {
		this.celId = celId;
	}

	public Integer getEveEventoEleccionario() {
		return eveEventoEleccionario;
	}

	public void setEveEventoEleccionario(Integer eveEventoEleccionario) {
		this.eveEventoEleccionario = eveEventoEleccionario;
	}

	public String getCelDescripcion() {
		return celDescripcion;
	}

	public void setCelDescripcion(String celDescripcion) {
		this.celDescripcion = celDescripcion;
	}

	public boolean isCelActiva() {
		return celActiva;
	}

	public void setCelActiva(boolean celActiva) {
		this.celActiva = celActiva;
	}

}
