package cl.servel.gasto.model;
// Generated 13-09-2018 17:23:15 by Hibernate Tools 5.2.11.Final

/**
 * NivNivelId generated by hbm2java
 */
public class NivNivelId implements java.io.Serializable {

	private int nivId;
	private String tpoNivCodigo;

	public NivNivelId() {
	}

	public NivNivelId(int nivId, String tpoNivCodigo) {
		this.nivId = nivId;
		this.tpoNivCodigo = tpoNivCodigo;
	}

	public int getNivId() {
		return this.nivId;
	}

	public void setNivId(int nivId) {
		this.nivId = nivId;
	}

	public String getTpoNivCodigo() {
		return this.tpoNivCodigo;
	}

	public void setTpoNivCodigo(String tpoNivCodigo) {
		this.tpoNivCodigo = tpoNivCodigo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NivNivelId))
			return false;
		NivNivelId castOther = (NivNivelId) other;

		return (this.getNivId() == castOther.getNivId()) && ((this.getTpoNivCodigo() == castOther.getTpoNivCodigo())
				|| (this.getTpoNivCodigo() != null && castOther.getTpoNivCodigo() != null
						&& this.getTpoNivCodigo().equals(castOther.getTpoNivCodigo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNivId();
		result = 37 * result + (getTpoNivCodigo() == null ? 0 : this.getTpoNivCodigo().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "NivNivelId [nivId=" + nivId + ", tpoNivCodigo=" + tpoNivCodigo + "]";
	}
	
	

}