package cl.servel.gasto.model;

import java.io.Serializable;
import java.util.Date;

public class Actividad implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7283292398571857254L;
	private Integer actId;
	private Integer intInstanciaTarea;
	private String actCodigo;
	private String actValorActividad;
	private Date actFechaActividad;
	private Boolean actActividadCompleta;

	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public Integer getIntInstanciaTarea() {
		return intInstanciaTarea;
	}

	public void setIntInstanciaTarea(Integer intInstanciaTarea) {
		this.intInstanciaTarea = intInstanciaTarea;
	}

	public String getActCodigo() {
		return actCodigo;
	}

	public void setActCodigo(String actCodigo) {
		this.actCodigo = actCodigo;
	}

	public String getActValorActividad() {
		return actValorActividad;
	}

	public void setActValorActividad(String actValorActividad) {
		this.actValorActividad = actValorActividad;
	}

	public Date getActFechaActividad() {
		return actFechaActividad;
	}

	public void setActFechaActividad(Date actFechaActividad) {
		this.actFechaActividad = actFechaActividad;
	}

	public Boolean getActActividadCompleta() {
		return actActividadCompleta;
	}

	public void setActActividadCompleta(Boolean actActividadCompleta) {
		this.actActividadCompleta = actActividadCompleta;
	}
}
