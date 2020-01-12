package cl.servel.gasto.model;

import java.io.Serializable;

public class DetalleActividad implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer dacId;
	private Integer actId;
	private Integer deaId;
	private boolean dacActividadCompletada;

	public Integer getDacId() {
		return dacId;
	}

	public void setDacId(Integer dacId) {
		this.dacId = dacId;
	}

	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public Integer getDeaId() {
		return deaId;
	}

	public void setDeaId(Integer deaId) {
		this.deaId = deaId;
	}

	public boolean isDacActividadCompletada() {
		return dacActividadCompletada;
	}

	public void setDacActividadCompletada(boolean dacActividadCompletada) {
		this.dacActividadCompletada = dacActividadCompletada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
