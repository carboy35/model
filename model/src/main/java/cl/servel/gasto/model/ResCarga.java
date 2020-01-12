package cl.servel.gasto.model;
// Generated 11-03-2019 11:20:33 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ResCarga implements java.io.Serializable {

	private Integer idResumen;
	private Integer idCarga;
	private Integer idEleccion;
	private String tipoCarga;
	private Integer totalRegistros;
	private Integer registrosBuenos;
	private Integer registrosMalos;
	private Date fechaInicio;
	private Date fechaTermino;
	private String estadoCarga;
	
	public Integer getIdResumen() {
		return idResumen;
	}
	public void setIdResumen(Integer idResumen) {
		this.idResumen = idResumen;
	}
	public Integer getIdCarga() {
		return idCarga;
	}
	public void setIdCarga(Integer idCarga) {
		this.idCarga = idCarga;
	}
	public Integer getIdEleccion() {
		return idEleccion;
	}
	public void setIdEleccion(Integer idEleccion) {
		this.idEleccion = idEleccion;
	}
	public String getTipoCarga() {
		return tipoCarga;
	}
	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}
	public Integer getTotalRegistros() {
		return totalRegistros;
	}
	public void setTotalRegistros(Integer totalRegistros) {
		this.totalRegistros = totalRegistros;
	}
	public Integer getRegistrosBuenos() {
		return registrosBuenos;
	}
	public void setRegistrosBuenos(Integer registrosBuenos) {
		this.registrosBuenos = registrosBuenos;
	}
	
	public Integer getRegistrosMalos() {
		return registrosMalos;
	}
	public void setRegistrosMalos(Integer registrosMalos) {
		this.registrosMalos = registrosMalos;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	public String getEstadoCarga() {
		return estadoCarga;
	}
	public void setEstadoCarga(String estadoCarga) {
		this.estadoCarga = estadoCarga;
	}
	
	
	

	

}
