package cl.servel.gasto.model;

import java.io.Serializable;

public class CelulaRevisor implements Serializable{
	private Integer idCelula;
	private Integer idRevisor;
	public Integer getIdCelula() {
		return idCelula;
	}
	public void setIdCelula(Integer idCelula) {
		this.idCelula = idCelula;
	}
	public Integer getIdRevisor() {
		return idRevisor;
	}
	public void setIdRevisor(Integer idRevisor) {
		this.idRevisor = idRevisor;
	}
	
}
