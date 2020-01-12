package cl.servel.gasto.model;

import java.io.Serializable;

public class TipoRecomendacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer tpoRecId;

	public Integer getTpoRecId() {
		return tpoRecId;
	}

	public void setTpoRecId(Integer tpoRecId) {
		this.tpoRecId = tpoRecId;
	}

	public String getTpoNombreRecomendacion() {
		return tpoNombreRecomendacion;
	}

	public void setTpoNombreRecomendacion(String tpoNombreRecomendacion) {
		this.tpoNombreRecomendacion = tpoNombreRecomendacion;
	}

	private String tpoNombreRecomendacion;
}
