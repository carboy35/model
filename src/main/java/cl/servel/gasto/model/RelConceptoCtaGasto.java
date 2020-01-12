package cl.servel.gasto.model;

import java.io.Serializable;

public class RelConceptoCtaGasto implements Serializable {

	private Integer rlcId;
	private Integer tpoConceptoId;
	private Integer tpoCtaId;

	public Integer getRlcId() {
		return rlcId;
	}

	public void setRlcId(Integer rlcId) {
		this.rlcId = rlcId;
	}

	public Integer getTpoConceptoId() {
		return tpoConceptoId;
	}

	public void setTpoConceptoId(Integer tpoConceptoId) {
		this.tpoConceptoId = tpoConceptoId;
	}

	public Integer getTpoCtaId() {
		return tpoCtaId;
	}

	public void setTpoCtaId(Integer tpoCtaId) {
		this.tpoCtaId = tpoCtaId;
	}

}
