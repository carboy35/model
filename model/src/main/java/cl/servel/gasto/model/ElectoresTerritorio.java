package cl.servel.gasto.model;
// Generated 13-09-2018 17:23:15 by Hibernate Tools 5.2.11.Final

import java.util.Date;


/**
 * CanCandidato generated by hbm2java
 */
public class ElectoresTerritorio implements java.io.Serializable {

	
	private String idCodigoOrigen;
	private String tipoNivel;
	private Integer totalElectores;
	
	
	public String getIdCodigoOrigen() {
		return idCodigoOrigen;
	}
	public void setIdCodigoOrigen(String idCodigoOrigen) {
		this.idCodigoOrigen = idCodigoOrigen;
	}
	public String getTipoNivel() {
		return tipoNivel;
	}
	public void setTipoNivel(String tipoNivel) {
		this.tipoNivel = tipoNivel;
	}
	public Integer getTotalElectores() {
		return totalElectores;
	}
	public void setTotalElectores(Integer totalElectores) {
		this.totalElectores = totalElectores;
	}
	
	
	
	
}