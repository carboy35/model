package cl.servel.gasto.model;

import java.io.Serializable;

public class InstanciaBandeja implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer inbId;
	private Integer eveId;
	private Integer usuId;
	private Integer dbnId;

	public InstanciaBandeja() {
		super();
	}

	public InstanciaBandeja(Integer inbId, Integer eveId, Integer usuId, Integer dbnId) {
		super();
		this.inbId = inbId;
		this.eveId = eveId;
		this.usuId = usuId;
		this.dbnId = dbnId;
	}

	public Integer getInbId() {
		return inbId;
	}

	public void setInbId(Integer inbId) {
		this.inbId = inbId;
	}

	public Integer getEveId() {
		return eveId;
	}

	public void setEveId(Integer eveId) {
		this.eveId = eveId;
	}

	public Integer getUsuId() {
		return usuId;
	}

	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}

	public Integer getDbnId() {
		return dbnId;
	}

	public void setDbnId(Integer dbnId) {
		this.dbnId = dbnId;
	}

}
