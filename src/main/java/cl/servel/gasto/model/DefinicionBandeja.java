package cl.servel.gasto.model;

import java.io.Serializable;

public class DefinicionBandeja implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer dbnId;
	private String dbnCodigo;
	private String dbnNombreBandeja;

	public Integer getDbnId() {
		return dbnId;
	}

	public void setDbnId(Integer dbnId) {
		this.dbnId = dbnId;
	}

	public String getDbnCodigo() {
		return dbnCodigo;
	}

	public void setDbnCodigo(String dbnCodigo) {
		this.dbnCodigo = dbnCodigo;
	}

	public String getDbnNombreBandeja() {
		return dbnNombreBandeja;
	}

	public void setDbnNombreBandeja(String dbnNombreBandeja) {
		this.dbnNombreBandeja = dbnNombreBandeja;
	}
}
