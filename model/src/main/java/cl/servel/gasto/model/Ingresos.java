package cl.servel.gasto.model;

import java.util.Date;

public class Ingresos {
	private Integer ingId;
	private Integer admId;
	private Integer canId;
	private Integer eventoId;
	private Integer parId;
	private Integer tpoIngresoId;
	private Integer usuId;
	private Integer ingRut;
	private String ingRutDv;
	private Date ingFechaIngreso;
	private Date ingCreated;
	private Integer detDetalleNominaId;
	private String estado;

	public Ingresos() {

	}

	public Integer getIngId() {
		return ingId;
	}

	public void setIngId(Integer ingId) {
		this.ingId = ingId;
	}

	public Integer getAdmId() {
		return admId;
	}

	public void setAdmId(Integer admId) {
		this.admId = admId;
	}

	public Integer getCanId() {
		return canId;
	}

	public void setCanId(Integer canId) {
		this.canId = canId;
	}

	public Integer getEventoId() {
		return eventoId;
	}

	public void setEventoId(Integer eventoId) {
		this.eventoId = eventoId;
	}

	public Integer getParId() {
		return parId;
	}

	public void setParId(Integer parId) {
		this.parId = parId;
	}

	public Integer getTpoIngresoId() {
		return tpoIngresoId;
	}

	public void setTpoIngresoId(Integer tpoIngresoId) {
		this.tpoIngresoId = tpoIngresoId;
	}

	public Integer getUsuId() {
		return usuId;
	}

	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}

	public Integer getIngRut() {
		return ingRut;
	}

	public void setIngRut(Integer ingRut) {
		this.ingRut = ingRut;
	}

	public String getIngRutDv() {
		return ingRutDv;
	}

	public void setIngRutDv(String ingRutDv) {
		this.ingRutDv = ingRutDv;
	}

	public Date getIngFechaIngreso() {
		return ingFechaIngreso;
	}

	public void setIngFechaIngreso(Date ingFechaIngreso) {
		this.ingFechaIngreso = ingFechaIngreso;
	}

	public Date getIngCreated() {
		return ingCreated;
	}

	public void setIngCreated(Date ingCreated) {
		this.ingCreated = ingCreated;
	}

	public Integer getDetDetalleNominaId() {
		return detDetalleNominaId;
	}

	public void setDetDetalleNominaId(Integer detDetalleNominaId) {
		this.detDetalleNominaId = detDetalleNominaId;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
