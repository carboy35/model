package cl.servel.gasto.model;

import java.io.Serializable;

public class DefinicionFlujo implements Serializable {

	private Integer dflId;
	private String dflNombreFlujo;
	private String dflCodigo;

	private Integer eveId;
	private int version;
	public DefinicionFlujo() {
		super();
	}

	public DefinicionFlujo(Integer dflId, String dflNombreFlujo, String dflCodigo, Integer eveId,int version) {
		super();
		this.dflId = dflId;
		this.dflNombreFlujo = dflNombreFlujo;
		this.dflCodigo = dflCodigo;
		this.eveId = eveId;
		this.version=version;
	}
	
	public Integer getDflId() {
		return dflId;
	}

	public void setDflId(Integer dflId) {
		this.dflId = dflId;
	}

	public String getDflNombreFlujo() {
		return dflNombreFlujo;
	}

	public void setDflNombreFlujo(String dflNombreFlujo) {
		this.dflNombreFlujo = dflNombreFlujo;
	}

	public String getDflCodigo() {
		return dflCodigo;
	}

	public void setDflCodigo(String dflCodigo) {
		this.dflCodigo = dflCodigo;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Integer getEveId() {
		return eveId;
	}

	public void setEveId(Integer eveId) {
		this.eveId = eveId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("DefinicionTarea").append(" [").append("dflId=").append(dflId).append(", dflNombreFlujo=").append(dflNombreFlujo).append(", version=").append(version).append("]");
		return sb.toString();
	}
}
