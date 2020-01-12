package cl.servel.gasto.model;

import java.io.Serializable;
import java.util.Date;


public class CuentaContable implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
	private Integer cctId;
	private Integer canCandidato;
	private Integer ebaEntidadBancaria;
	private Integer parPartido;
	private Integer tpoCtaBancaria;
	private Integer tpoCtaContable;
	private String cctNumeroCuenta;
	private Boolean cctEliminado;
	private Date cctCreated;
	private Date cctModified;
	public Integer getCctId() {
		return cctId;
	}
	public void setCctId(Integer cctId) {
		this.cctId = cctId;
	}
	public Integer getCanCandidato() {
		return canCandidato;
	}
	public void setCanCandidato(Integer canCandidato) {
		this.canCandidato = canCandidato;
	}
	public Integer getEbaEntidadBancaria() {
		return ebaEntidadBancaria;
	}
	public void setEbaEntidadBancaria(Integer ebaEntidadBancaria) {
		this.ebaEntidadBancaria = ebaEntidadBancaria;
	}
	public Integer getParPartido() {
		return parPartido;
	}
	public void setParPartido(Integer parPartido) {
		this.parPartido = parPartido;
	}
	public Integer getTpoCtaBancaria() {
		return tpoCtaBancaria;
	}
	public void setTpoCtaBancaria(Integer tpoCtaBancaria) {
		this.tpoCtaBancaria = tpoCtaBancaria;
	}
	public Integer getTpoCtaContable() {
		return tpoCtaContable;
	}
	public void setTpoCtaContable(Integer tpoCtaContable) {
		this.tpoCtaContable = tpoCtaContable;
	}
	public String getCctNumeroCuenta() {
		return cctNumeroCuenta;
	}
	public void setCctNumeroCuenta(String cctNumeroCuenta) {
		this.cctNumeroCuenta = cctNumeroCuenta;
	}
	public Boolean getCctEliminado() {
		return cctEliminado;
	}
	public void setCctEliminado(Boolean cctEliminado) {
		this.cctEliminado = cctEliminado;
	}
	public Date getCctCreated() {
		return cctCreated;
	}
	public void setCctCreated(Date cctCreated) {
		this.cctCreated = cctCreated;
	}
	public Date getCctModified() {
		return cctModified;
	}
	public void setCctModified(Date cctModified) {
		this.cctModified = cctModified;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
