package cl.servel.gasto.model;

import java.util.Date;

public class DetalleNomina {
	private Integer detId;
	private Integer admId;
	private Integer canId;
	private Integer nomId;
	private Integer parId;
	private Integer tpoMonedaId;
	private Integer detRut;
	private String detRutDv;
	private Double detMonto;
	private String detTransactionId;
	private Boolean detResultadoTgr;
	private Date detFechaPago;
	private String detEstado;
	private Integer detDetalleRendicionId;
	private Integer ebaId;
	private Long canIdRef;
	private Long parIdRef;
	private Long manIdRef;
	private Long folioServel;
	private Double detMontoPagado;


	

	public DetalleNomina() {

	}

	public Integer getDetId() {
		return detId;
	}

	public void setDetId(Integer detId) {
		this.detId = detId;
	}

	public Integer getAdmId() {
		return admId;
	}

	public void setAdmId(Integer admId) {
		this.admId = admId;
	}

	public Integer getCanId() {
		return canId;
	}

	public void setCanId(Integer canId) {
		this.canId = canId;
	}

	public Integer getNomId() {
		return nomId;
	}

	public void setNomId(Integer nomId) {
		this.nomId = nomId;
	}

	public Integer getParId() {
		return parId;
	}

	public void setParId(Integer parId) {
		this.parId = parId;
	}

	public Integer getTpoMonedaId() {
		return tpoMonedaId;
	}

	public void setTpoMonedaId(Integer tpoMonedaId) {
		this.tpoMonedaId = tpoMonedaId;
	}

	public Integer getDetRut() {
		return detRut;
	}

	public void setDetRut(Integer detRut) {
		this.detRut = detRut;
	}

	public String getDetRutDv() {
		return detRutDv;
	}

	public void setDetRutDv(String detRutDv) {
		this.detRutDv = detRutDv;
	}

	public Double getDetMonto() {
		return detMonto;
	}

	public void setDetMonto(Double detMonto) {
		this.detMonto = detMonto;
	}

	public String getDetTransactionId() {
		return detTransactionId;
	}

	public void setDetTransactionId(String detTransactionId) {
		this.detTransactionId = detTransactionId;
	}

	public Boolean getDetResultadoTgr() {
		return detResultadoTgr;
	}

	public void setDetResultadoTgr(Boolean detResultadoTgr) {
		this.detResultadoTgr = detResultadoTgr;
	}

	public Date getDetFechaPago() {
		return detFechaPago;
	}

	public void setDetFechaPago(Date detFechaPago) {
		this.detFechaPago = detFechaPago;
	}

	public String getDetEstado() {
		return detEstado;
	}

	public void setDetEstado(String detEstado) {
		this.detEstado = detEstado;
	}

	public Integer getDetDetalleRendicionId() {
		return detDetalleRendicionId;
	}

	public void setDetDetalleRendicionId(Integer detDetalleRendicionId) {
		this.detDetalleRendicionId = detDetalleRendicionId;
	}

	public Integer getEbaId() {
		return ebaId;
	}

	public void setEbaId(Integer ebaId) {
		this.ebaId = ebaId;
	}

	public Long getCanIdRef() {
		return canIdRef;
	}

	public void setCanIdRef(Long canIdRef) {
		this.canIdRef = canIdRef;
	}

	public Long getParIdRef() {
		return parIdRef;
	}

	public void setParIdRef(Long parIdRef) {
		this.parIdRef = parIdRef;
	}
	
	public Long getManIdRef() {
		return manIdRef;
	}

	public void setManIdRef(Long manIdRef) {
		this.manIdRef = manIdRef;
	}
	
	public Long getFolioServel() {
		return folioServel;
	}

	public void setFolioServel(Long folioServel) {
		this.folioServel = folioServel;
	}
	
	public Double getDetMontoPagado() {
		return detMontoPagado;
	}

	public void setDetMontoPagado(Double detMontoPagado) {
		this.detMontoPagado = detMontoPagado;
	}

}
