package cl.servel.gasto.model;
// Generated 13-09-2018 17:23:15 by Hibernate Tools 5.2.11.Final

import java.util.Date;



/**
 * PacPacto generated by hbm2java
 */
public class Pacto implements java.io.Serializable {

	private Integer pacId;
	
	private Integer idEleccion;
	private String pacNombre;
	private String pacCodigoOrigen;
	private String pacSigla;
	private String lista;
	private Boolean pacEliminado;
	private Date pacCreated;
	private Date pacModified;
	
	
	public Integer getIdEleccion() {
		return idEleccion;
	}
	public void setIdEleccion(Integer idEleccion) {
		this.idEleccion = idEleccion;
	}
	
	public Integer getPacId() {
		return pacId;
	}
	public void setPacId(Integer pacId) {
		this.pacId = pacId;
	}

	public String getPacNombre() {
		return pacNombre;
	}
	public void setPacNombre(String pacNombre) {
		this.pacNombre = pacNombre;
	}
	public String getPacCodigoOrigen() {
		return pacCodigoOrigen;
	}
	public void setPacCodigoOrigen(String pacCodigoOrigen) {
		this.pacCodigoOrigen = pacCodigoOrigen;
	}
	public String getPacSigla() {
		return pacSigla;
	}
	public void setPacSigla(String pacSigla) {
		this.pacSigla = pacSigla;
	}
	public String getLista() {
		return lista;
	}
	public void setLista(String lista) {
		this.lista = lista;
	}
	public Boolean getPacEliminado() {
		return pacEliminado;
	}
	public void setPacEliminado(Boolean pacEliminado) {
		this.pacEliminado = pacEliminado;
	}
	public Date getPacCreated() {
		return pacCreated;
	}
	public void setPacCreated(Date pacCreated) {
		this.pacCreated = pacCreated;
	}
	public Date getPacModified() {
		return pacModified;
	}
	public void setPacModified(Date pacModified) {
		this.pacModified = pacModified;
	}
	
	
}
