package cl.servel.gasto.model;

import java.io.Serializable;


public class TipoReembolso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer tpoRendicionId;
	private String tpoCodigo;
	

	private String tpoReembolsoCodigo;
	private String tpoReembolsoNombre;
	private Integer eveId;
	
	

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
	
	public String getTpoCodigo() {
		return tpoCodigo;
	}

	public void setTpoCodigo(String tpoCodigo) {
		this.tpoCodigo = tpoCodigo;
	}

	public String getTpoReembolsoCodigo() {
		return tpoReembolsoCodigo;
	}

	public void setTpoReembolsoCodigo(String tpoReembolsoCodigo) {
		this.tpoReembolsoCodigo = tpoReembolsoCodigo;
	}

	public String getTpoReembolsoNombre() {
		return tpoReembolsoNombre;
	}

	public void setTpoReembolsoNombre(String tpoReembolsoNombre) {
		this.tpoReembolsoNombre = tpoReembolsoNombre;
	}

	
	public Integer getEveId() {
		return eveId;
	}

	public void setEveId(Integer eveId) {
		this.eveId = eveId;
	}
}
