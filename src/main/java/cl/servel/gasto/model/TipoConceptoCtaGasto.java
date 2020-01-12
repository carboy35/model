package cl.servel.gasto.model;

import java.io.Serializable;

public class TipoConceptoCtaGasto implements Serializable {

	private Integer tpoConceptoId;
	private Integer eveId;
	private Integer tpoRendicionId;
	private String tpoConceptoCodigo;
	private String tpoConceptoNombre;
	private String tpoRendicionCodigo;

	public Integer getTpoConceptoId() {
		return tpoConceptoId;
	}

	public void setTpoConceptoId(Integer tpoConceptoId) {
		this.tpoConceptoId = tpoConceptoId;
	}

	public Integer getEveId() {
		return eveId;
	}

	public void setEveId(Integer eveId) {
		this.eveId = eveId;
	}

	public Integer getTpoRendicionId() {
		return tpoRendicionId;
	}

	public void setTpoRendicionId(Integer tpoRendicionId) {
		this.tpoRendicionId = tpoRendicionId;
	}

	public String getTpoConceptoCodigo() {
		return tpoConceptoCodigo;
	}

	public void setTpoConceptoCodigo(String tpoConceptoCodigo) {
		this.tpoConceptoCodigo = tpoConceptoCodigo;
	}

	public String getTpoConceptoNombre() {
		return tpoConceptoNombre;
	}

	public void setTpoConceptoNombre(String tpoConceptoNombre) {
		this.tpoConceptoNombre = tpoConceptoNombre;
	}

	public String getTpoRendicionCodigo() {
		return tpoRendicionCodigo;
	}

	public void setTpoRendicionCodigo(String tpoRendicionCodigo) {
		this.tpoRendicionCodigo = tpoRendicionCodigo;
	}
}
