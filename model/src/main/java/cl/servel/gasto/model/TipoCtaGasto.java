package cl.servel.gasto.model;

import java.io.Serializable;

public class TipoCtaGasto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer tpoRendicionId;
	private int tpoCtaCodigo;
	private String tpoCtaNombre;
	private Integer idEvento;
	private String tpoCodigo; 
	private Double total;
	
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

	public int getTpoCtaCodigo() {
		return tpoCtaCodigo;
	}

	public void setTpoCtaCodigo(int tpoCtaCodigo) {
		this.tpoCtaCodigo = tpoCtaCodigo;
	}

	public String getTpoCtaNombre() {
		return tpoCtaNombre;
	}

	public void setTpoCtaNombre(String tpoCtaNombre) {
		this.tpoCtaNombre = tpoCtaNombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}



}
