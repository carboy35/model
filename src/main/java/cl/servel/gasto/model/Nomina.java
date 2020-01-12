package cl.servel.gasto.model;

import java.util.Date;


public class Nomina {
	private Integer nomId;
	private Integer eventoId;
	private Integer tpoNominaId;
	private Integer usuId;
	private Integer nomFolio;
	private Date nomFechaNomina;
	private String nomEstado;
	
	public Nomina() {
		
	}
	public Integer getNomId() {
		return nomId;
	}
	public void setNomId(Integer nomId) {
		this.nomId = nomId;
	}
	public Integer getEventoId() {
		return eventoId;
	}
	public void setEventoId(Integer eventoId) {
		this.eventoId = eventoId;
	}
	public Integer getTpoNominaId() {
		return tpoNominaId;
	}
	public void setTpoNominaId(Integer tpoNominaId) {
		this.tpoNominaId = tpoNominaId;
	}
	public Integer getUsuId() {
		return usuId;
	}
	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}
	public Integer getNomFolio() {
		return nomFolio;
	}
	public void setNomFolio(Integer nomFolio) {
		this.nomFolio = nomFolio;
	}
	public Date getNomFechaNomina() {
		return nomFechaNomina;
	}
	public void setNomFechaNomina(Date nomFechaNomina) {
		this.nomFechaNomina = nomFechaNomina;
	}
	public String getNomEstado() {
		return nomEstado;
	}
	public void setNomEstado(String nomEstado) {
		this.nomEstado = nomEstado;
	}
}
