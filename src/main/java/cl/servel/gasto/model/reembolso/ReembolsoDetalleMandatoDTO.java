package cl.servel.gasto.model.reembolso;

import java.util.Date;

import cl.servel.gasto.model.Mandato;

public class ReembolsoDetalleMandatoDTO {
	int reembolsoSolicitado;
	int montoAutorizado;
	int montoCapital;
	int intereses;
	int montoPas;
	boolean pagado;
	String estado;
	
	int manId;

	int canId;
	int dexId;
	int ebaId;
	int parId;
	String manCuentaBancaria;
	String manNumeroDocumento;
	
	
	public int getReembolsoSolicitado() {
		return reembolsoSolicitado;
	}
	public void setReembolsoSolicitado(int reembolsoSolicitado) {
		this.reembolsoSolicitado = reembolsoSolicitado;
	}
	public int getMontoAutorizado() {
		return montoAutorizado;
	}
	public void setMontoAutorizado(int montoAutorizado) {
		this.montoAutorizado = montoAutorizado;
	}
	public int getMontoCapital() {
		return montoCapital;
	}
	public void setMontoCapital(int montoCapital) {
		this.montoCapital = montoCapital;
	}
	public int getIntereses() {
		return intereses;
	}
	public void setIntereses(int intereses) {
		this.intereses = intereses;
	}
	public int getMontoPas() {
		return montoPas;
	}
	public void setMontoPas(int montoPas) {
		this.montoPas = montoPas;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getManId() {
		return manId;
	}
	public void setManId(int manId) {
		this.manId = manId;
	}
	public int getCanId() {
		return canId;
	}
	public void setCanId(int canId) {
		this.canId = canId;
	}
	public int getDexId() {
		return dexId;
	}
	public void setDexId(int dexId) {
		this.dexId = dexId;
	}
	public int getEbaId() {
		return ebaId;
	}
	public void setEbaId(int ebaId) {
		this.ebaId = ebaId;
	}
	public int getParId() {
		return parId;
	}
	public void setParId(int parId) {
		this.parId = parId;
	}

	public String getManCuentaBancaria() {
		return manCuentaBancaria;
	}
	public void setManCuentaBancaria(String manCuentaBancaria) {
		this.manCuentaBancaria = manCuentaBancaria;
	}
	public String getManNumeroDocumento() {
		return manNumeroDocumento;
	}
	public void setManNumeroDocumento(String manNumeroDocumento) {
		this.manNumeroDocumento = manNumeroDocumento;
	}
	
}
