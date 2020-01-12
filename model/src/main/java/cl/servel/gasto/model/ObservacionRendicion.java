package cl.servel.gasto.model;

import java.util.Date;

public class ObservacionRendicion {

	private Integer obrId;
	private Integer renRendicionId;
	private Integer obrNumeroLinea;
	private Integer obrNumeroPagina;
	private boolean obrHabilitada;
	private String obrRespuesta;
	private Integer dexId;
	private Date obrFechaRespuesta;
	private String obrTipoIngresoRespuesta;
	private String obrAnalisisRespuesta;
	private Integer tpoRecId;


	public ObservacionRendicion() {
		super();
	}

	public ObservacionRendicion(Integer obrId, Integer renRendicionId, Integer obrNumeroLinea, Integer obrNumeroPagina, boolean obrHabilitada, String obrRespuesta, Integer dexId, Date obrFechaRespuesta, String obrTipoIngresoRespuesta, String obrAnalisisRespuesta, Integer tpoRecId) {
		super();
		this.obrId = obrId;
		this.renRendicionId = renRendicionId;
		this.obrNumeroLinea = obrNumeroLinea;
		this.obrNumeroPagina = obrNumeroPagina;
		this.obrHabilitada = obrHabilitada;
		this.obrRespuesta = obrRespuesta;
		this.dexId = dexId;
		this.obrFechaRespuesta = obrFechaRespuesta;
		this.obrTipoIngresoRespuesta = obrTipoIngresoRespuesta;
		this.obrAnalisisRespuesta = obrAnalisisRespuesta;
		this.tpoRecId = tpoRecId;		
	}

	public Integer getObrId() {
		return obrId;
	}

	public void setObrId(Integer obrId) {
		this.obrId = obrId;
	}

	public Integer getRenRendicionId() {
		return renRendicionId;
	}

	public void setRenRendicionId(Integer renRendicionId) {
		this.renRendicionId = renRendicionId;
	}

	public Integer getObrNumeroLinea() {
		return obrNumeroLinea;
	}

	public void setObrNumeroLinea(Integer obrNumeroLinea) {
		this.obrNumeroLinea = obrNumeroLinea;
	}

	public Integer getObrNumeroPagina() {
		return obrNumeroPagina;
	}

	public void setObrNumeroPagina(Integer obrNumeroPagina) {
		this.obrNumeroPagina = obrNumeroPagina;
	}

	public boolean isObrHabilitada() {
		return obrHabilitada;
	}

	public void setObrHabilitada(boolean obrHabilitada) {
		this.obrHabilitada = obrHabilitada;
	}

	public String getObrRespuesta() {
		return obrRespuesta;
	}

	public void setObrRespuesta(String obrRespuesta) {
		this.obrRespuesta = obrRespuesta;
	}

	public String getObrAnalisisRespuesta() {
		return obrAnalisisRespuesta;
	}

	public void setObrAnalisisRespuesta(String obrAnalisisRespuesta) {
		this.obrAnalisisRespuesta = obrAnalisisRespuesta;
	}

	public Integer getTpoRecId() {
		return tpoRecId;
	}

	public void setTpoRecId(Integer tpoRecId) {
		this.tpoRecId = tpoRecId;
	}

	
	public Integer getDexId() {
		return dexId;
	}

	public void setDexId(Integer dexId) {
		this.dexId = dexId;
	}

	public Date getObrFechaRespuesta() {
		return obrFechaRespuesta;
	}

	public void setObrFechaRespuesta(Date obrFechaRespuesta) {
		this.obrFechaRespuesta = obrFechaRespuesta;
	}

	public String getObrTipoIngresoRespuesta() {
		return obrTipoIngresoRespuesta;
	}

	public void setObrTipoIngresoRespuesta(String obrTipoIngresoRespuesta) {
		this.obrTipoIngresoRespuesta = obrTipoIngresoRespuesta;
	}

	@Override
	public String toString() {
		return "ObservacionRendicion [obrId=" + obrId + ", renRendicionId=" + renRendicionId + ", obrNumeroLinea=" + obrNumeroLinea + ", obrNumeroPagina=" + obrNumeroPagina + ", obrHabilitada=" + obrHabilitada + ", obrRespuesta=" + obrRespuesta + ", dexId=" + dexId + ", obrFechaRespuesta=" + obrFechaRespuesta
				+ ", obrTipoIngresoRespuesta=" + obrTipoIngresoRespuesta + "]";
	}

}
