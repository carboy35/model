package cl.servel.gasto.model;

import java.io.Serializable;

public class RelPerfilDefinicionTarea implements Serializable {

	private Integer rlcId;
	private Integer dtaDefinicionTarea;

	public Integer getRlcId() {
		return rlcId;
	}

	public void setRlcId(Integer rlcId) {
		this.rlcId = rlcId;
	}

	public Integer getDtaDefinicionTarea() {
		return dtaDefinicionTarea;
	}

	public void setDtaDefinicionTarea(Integer dtaDefinicionTarea) {
		this.dtaDefinicionTarea = dtaDefinicionTarea;
	}

	public Integer getPerPerfil() {
		return perPerfil;
	}

	public void setPerPerfil(Integer perPerfil) {
		this.perPerfil = perPerfil;
	}

	private Integer perPerfil;
}
