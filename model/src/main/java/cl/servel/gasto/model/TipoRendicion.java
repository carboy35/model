package cl.servel.gasto.model;
// Generated 02-01-2019 19:29:27 by Hibernate Tools 5.2.11.Final

import java.io.Serializable;

public class TipoRendicion implements Serializable {

	private Integer tpoRendicionId;
	private Integer eveEventoEleccionarioId;
	private String tpoNombre;
	private String tpoCodigo;
	
	
	public Integer getTpoRendicionId() {
		return tpoRendicionId;
	}
	public void setTpoRendicionId(Integer tpoRendicionId) {
		this.tpoRendicionId = tpoRendicionId;
	}
	public Integer getEveEventoEleccionarioId() {
		return eveEventoEleccionarioId;
	}
	public void setEveEventoEleccionarioId(Integer eveEventoEleccionarioId) {
		this.eveEventoEleccionarioId = eveEventoEleccionarioId;
	}
	public String getTpoNombre() {
		return tpoNombre;
	}
	public void setTpoNombre(String tpoNombre) {
		this.tpoNombre = tpoNombre;
	}
	public String getTpoCodigo() {
		return tpoCodigo;
	}
	public void setTpoCodigo(String tpoCodigo) {
		this.tpoCodigo = tpoCodigo;
	}

	
}
