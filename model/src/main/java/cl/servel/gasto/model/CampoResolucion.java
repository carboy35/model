package cl.servel.gasto.model;

import java.io.Serializable;

public class CampoResolucion implements Serializable {

	private Integer idCampo;
	private String tipoCampo;
	private String contenido;
	
	public Integer getIdCampo() {
		return idCampo;
	}
	public void setIdCampo(Integer tipoCampo) {
		this.idCampo = tipoCampo;
	}	
	public String getTipoCampo() {
		return tipoCampo;
	}
	public void setTipoCampo(String tipoCampo) {
		this.tipoCampo = tipoCampo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}	
}
