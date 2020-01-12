package cl.servel.gasto.model;
// Generated 13-09-2018 17:23:15 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EleEleccion generated by hbm2java
 */
public class LimiteGasto implements java.io.Serializable {

	private Integer limId;
	private Integer IdEleccion;
	private Integer IdEventoEleccionario;
	private Integer nivNivelByNivHijoId;
	private Integer nivNivelByNivPadreId;
	private Integer IdPartido;
	private Integer IdTpoEleccion;
	private Boolean esLimiteGastoPartido;
	private Double limMaxPersona;
	private Double limTotalLimite;
	private Integer numeroElectores;
	private Double limMaxAporteSinPub;
	private Double limMaxAportePerCan;
	
	
	public Integer getLimId() {
		return limId;
	}
	public void setLimId(Integer limId) {
		this.limId = limId;
	}
	public Integer getIdEleccion() {
		return IdEleccion;
	}
	public void setIdEleccion(Integer idEleccion) {
		IdEleccion = idEleccion;
	}
	public Integer getIdEventoEleccionario() {
		return IdEventoEleccionario;
	}
	public void setIdEventoEleccionario(Integer idEventoEleccionario) {
		IdEventoEleccionario = idEventoEleccionario;
	}
	public Integer getNivNivelByNivHijoId() {
		return nivNivelByNivHijoId;
	}
	public void setNivNivelByNivHijoId(Integer nivNivelByNivHijoId) {
		this.nivNivelByNivHijoId = nivNivelByNivHijoId;
	}
	public Integer getNivNivelByNivPadreId() {
		return nivNivelByNivPadreId;
	}
	public void setNivNivelByNivPadreId(Integer nivNivelByNivPadreId) {
		this.nivNivelByNivPadreId = nivNivelByNivPadreId;
	}
	public Integer getIdPartido() {
		return IdPartido;
	}
	public void setIdPartido(Integer idPartido) {
		IdPartido = idPartido;
	}
	public Integer getIdTpoEleccion() {
		return IdTpoEleccion;
	}
	public void setIdTpoEleccion(Integer idTpoEleccion) {
		IdTpoEleccion = idTpoEleccion;
	}
	public Boolean getEsLimiteGastoPartido() {
		return esLimiteGastoPartido;
	}
	public void setEsLimiteGastoPartido(Boolean esLimiteGastoPartido) {
		this.esLimiteGastoPartido = esLimiteGastoPartido;
	}

	public Double getLimMaxPersona() {
		return limMaxPersona;
	}
	public void setLimMaxPersona(Double limMaxPersona) {
		this.limMaxPersona = limMaxPersona;
	}
	public Double getLimMaxAporteSinPub() {
		return limMaxAporteSinPub;
	}
	public void setLimMaxAporteSinPub(Double limMaxAporteSinPub) {
		this.limMaxAporteSinPub = limMaxAporteSinPub;
	}
	public Double getLimMaxAportePerCan() {
		return limMaxAportePerCan;
	}
	public void setLimMaxAportePerCan(Double limMaxAportePerCan) {
		this.limMaxAportePerCan = limMaxAportePerCan;
	}
	public Double getLimTotalLimite() {
		return limTotalLimite;
	}
	public void setLimTotalLimite(Double limTotalLimite) {
		this.limTotalLimite = limTotalLimite;
	}
	public Integer getNumeroElectores() {
		return numeroElectores;
	}
	public void setNumeroElectores(Integer numeroElectores) {
		this.numeroElectores = numeroElectores;
	}
	
	
}
