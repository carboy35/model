package cl.servel.gasto.model;

import java.io.Serializable;

public class GrupoUsuarioTarea implements Serializable {

	private Integer gutId;
	private String gutAgrupacion;
	private Integer celulaId;

	public GrupoUsuarioTarea() {
	}

	public GrupoUsuarioTarea(Integer gutId, String gutAgrupacion, Integer celulaId) {
		this.gutId = gutId;
		this.gutAgrupacion = gutAgrupacion;
		this.celulaId = celulaId;
	}

	public Integer getGutId() {
		return gutId;
	}

	public void setGutId(Integer gutId) {
		this.gutId = gutId;
	}

	public String getGutAgrupacion() {
		return gutAgrupacion;
	}

	public void setGutAgrupacion(String gutAgrupacion) {
		this.gutAgrupacion = gutAgrupacion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("DefinicionTarea").append(" [").append("gutId=").append(gutId).append(", gutAgrupacion=").append(gutAgrupacion).append("]");

		return sb.toString();
	}

	public Integer getCelulaId() {
		return celulaId;
	}

	public void setCelulaId(Integer celulaId) {
		this.celulaId = celulaId;
	}

}
