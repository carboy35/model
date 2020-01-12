package cl.servel.gasto.model;

import java.io.Serializable;
import java.util.Date;

public class Mandato implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer manId;
	private Integer canId;
	private Integer dexId;
	private Integer ebaId;
	private Integer parId;
	private Date manFechaMandato;
	private Date manCreated;
	private Double manMontoBruto;
	private Double manMontoInteres;
	private Double manMontoMandato;
	private String manCuentaBancaria;
	private String manGlosaSuperior;
	private boolean manEliminado;
	private String manNumeroDocumento;
	
	
	public Integer getManId() {
		return manId;
	}
	public void setManId(Integer manId) {
		this.manId = manId;
	}
	public Integer getCanId() {
		return canId;
	}
	public void setCanId(Integer canId) {
		this.canId = canId;
	}
	public Integer getDexId() {
		return dexId;
	}
	public void setDexId(Integer dexId) {
		this.dexId = dexId;
	}
	public Integer getEbaId() {
		return ebaId;
	}
	public void setEbaId(Integer ebaId) {
		this.ebaId = ebaId;
	}
	public Integer getParId() {
		return parId;
	}
	public void setParId(Integer parId) {
		this.parId = parId;
	}
	public Date getManFechaMandato() {
		return manFechaMandato;
	}
	public void setManFechaMandato(Date manFechaMandato) {
		this.manFechaMandato = manFechaMandato;
	}
	public Date getManCreated() {
		return manCreated;
	}
	public void setManCreated(Date manCreated) {
		this.manCreated = manCreated;
	}
	public Double getManMontoBruto() {
		return manMontoBruto;
	}
	public void setManMontoBruto(Double manMontoBruto) {
		this.manMontoBruto = manMontoBruto;
	}
	public Double getManMontoInteres() {
		return manMontoInteres;
	}
	public void setManMontoInteres(Double manMontoInteres) {
		this.manMontoInteres = manMontoInteres;
	}
	public Double getManMontoMandato() {
		return manMontoMandato;
	}
	public void setManMontoMandato(Double manMontoMandato) {
		this.manMontoMandato = manMontoMandato;
	}
	public String getManCuentaBancaria() {
		return manCuentaBancaria;
	}
	public void setManCuentaBancaria(String manCuentaBancaria) {
		this.manCuentaBancaria = manCuentaBancaria;
	}	
	public String getManGlosaSuperior() {
		return manGlosaSuperior;
	}
	public void setManGlosaSuperior(String manGlosaSuperior) {
		this.manGlosaSuperior = manGlosaSuperior;
	}
	public boolean isManEliminado() {
		return manEliminado;
	}
	public void setManEliminado(boolean manEliminado) {
		this.manEliminado = manEliminado;
	}	
	public String getManNumeroDocumento() {
		return manNumeroDocumento;
	}
	public void setManNumeroDocumento(String manNumeroDocumento) {
		this.manNumeroDocumento = manNumeroDocumento;
	}
}
