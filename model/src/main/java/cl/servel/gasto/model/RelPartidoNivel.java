package cl.servel.gasto.model;
// Generated 13-09-2018 17:23:15 by Hibernate Tools 5.2.11.Final

import java.util.Date;



/**
 * RlcRelNivelId generated by hbm2java
 */
public class RelPartidoNivel implements java.io.Serializable {

	

	private int rlcId;
	private int nivNivel;
	private int parPartido;
	private String tpoNivel;
	private Date rlcPartidoNivelFechaVigencia;
	private int eventoId;
	
	
	public int getRlcId() {
		return rlcId;
	}


	public void setRlcId(int rlcId) {
		this.rlcId = rlcId;
	}


	public int getNivNivel() {
		return nivNivel;
	}


	public void setNivNivel(int nivNivel) {
		this.nivNivel = nivNivel;
	}


	public int getParPartido() {
		return parPartido;
	}


	public void setParPartido(int parPartido) {
		this.parPartido = parPartido;
	}


	public String getTpoNivel() {
		return tpoNivel;
	}


	public void setTpoNivel(String tpoNivel) {
		this.tpoNivel = tpoNivel;
	}


	public Date getRlcPartidoNivelFechaVigencia() {
		return rlcPartidoNivelFechaVigencia;
	}


	public void setRlcPartidoNivelFechaVigencia(Date rlcPartidoNivelFechaVigencia) {
		this.rlcPartidoNivelFechaVigencia = rlcPartidoNivelFechaVigencia;
	}


	
	
	public RelPartidoNivel() {
	}


	public int getEventoId() {
		return eventoId;
	}


	public void setEventoId(int eventoId) {
		this.eventoId = eventoId;
	}

	
	

}
