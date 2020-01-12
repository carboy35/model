package cl.servel.gasto.model;
// Generated 13-09-2018 17:23:15 by Hibernate Tools 5.2.11.Final

import java.util.Date;

/**
 * TpoCandidatoId generated by hbm2java
 */
public class TpoCandidatoId implements java.io.Serializable {

	private int tpoCandidatoId;
	private String tpoNombre;
	private Date tpoCreated;

	public TpoCandidatoId() {
	}

	public TpoCandidatoId(int tpoCandidatoId) {
		this.tpoCandidatoId = tpoCandidatoId;
	}

	public TpoCandidatoId(int tpoCandidatoId, String tpoNombre, Date tpoCreated) {
		this.tpoCandidatoId = tpoCandidatoId;
		this.tpoNombre = tpoNombre;
		this.tpoCreated = tpoCreated;
	}

	public int getTpoCandidatoId() {
		return this.tpoCandidatoId;
	}

	public void setTpoCandidatoId(int tpoCandidatoId) {
		this.tpoCandidatoId = tpoCandidatoId;
	}

	public String getTpoNombre() {
		return this.tpoNombre;
	}

	public void setTpoNombre(String tpoNombre) {
		this.tpoNombre = tpoNombre;
	}

	public Date getTpoCreated() {
		return this.tpoCreated;
	}

	public void setTpoCreated(Date tpoCreated) {
		this.tpoCreated = tpoCreated;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TpoCandidatoId))
			return false;
		TpoCandidatoId castOther = (TpoCandidatoId) other;

		return (this.getTpoCandidatoId() == castOther.getTpoCandidatoId())
				&& ((this.getTpoNombre() == castOther.getTpoNombre()) || (this.getTpoNombre() != null
						&& castOther.getTpoNombre() != null && this.getTpoNombre().equals(castOther.getTpoNombre())))
				&& ((this.getTpoCreated() == castOther.getTpoCreated())
						|| (this.getTpoCreated() != null && castOther.getTpoCreated() != null
								&& this.getTpoCreated().equals(castOther.getTpoCreated())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTpoCandidatoId();
		result = 37 * result + (getTpoNombre() == null ? 0 : this.getTpoNombre().hashCode());
		result = 37 * result + (getTpoCreated() == null ? 0 : this.getTpoCreated().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "TpoCandidatoId [tpoCandidatoId=" + tpoCandidatoId + ", tpoNombre=" + tpoNombre + ", tpoCreated="
				+ tpoCreated + "]";
	}
	
	

}