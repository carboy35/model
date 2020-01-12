package cl.servel.gasto.model;

import java.io.Serializable;

public class TipoDocGasto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer tpoRendicionId;
	private String tpoDocCodigo;
	private String tpoDocNombre;
	private Integer idEvento;
	private String tpoCodigo; 

	public String getTpoCodigo() {
		return tpoCodigo;
	}

	public void setTpoCodigo(String tpoCodigo) {
		this.tpoCodigo = tpoCodigo;
	}

	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTpoRendicionId() {
		return tpoRendicionId;
	}

	public void setTpoRendicionId(Integer tpoRendicionId) {
		this.tpoRendicionId = tpoRendicionId;
	}

	public String getTpoDocCodigo() {
		return tpoDocCodigo;
	}

	public void setTpoDocCodigo(String tpoDocCodigo) {
		this.tpoDocCodigo = tpoDocCodigo;
	}

	public String getTpoDocNombre() {
		return tpoDocNombre;
	}

	public void setTpoDocNombre(String tpoDocNombre) {
		this.tpoDocNombre = tpoDocNombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
