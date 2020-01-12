package cl.servel.gasto.model.reembolso;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalReembolsoDetalleMandatoDTO {
	int totalReembolsoSolicitado;
	int totalMontoAutorizado;
	int totalMontoCapital;
	int totalIntereses;
	int saldoReembolsoMaximo;
	int montoPas;
	boolean pagado;
//	String estado;

	public int getTotalReembolsoSolicitado() {
		return totalReembolsoSolicitado;
	}
	public void setTotalReembolsoSolicitado(int totalReembolsoSolicitado) {
		this.totalReembolsoSolicitado = totalReembolsoSolicitado;
	}
	public int getTotalMontoAutorizado() {
		return totalMontoAutorizado;
	}
	public void setTotalMontoAutorizado(int totalMontoAutorizado) {
		this.totalMontoAutorizado = totalMontoAutorizado;
}
	public int getTotalMontoCapital() {
		return totalMontoCapital;
	}
	public void setTotalMontoCapital(int totalMontoCapital) {
		this.totalMontoCapital = totalMontoCapital;
	}
	public int getTotalIntereses() {
		return totalIntereses;
	}
	public void setTotalIntereses(int totalIntereses) {
		this.totalIntereses = totalIntereses;
	}
	public int getSaldoReembolsoMaximo() {
		return saldoReembolsoMaximo;
	}
	public void setSaldoReembolsoMaximo(int saldoReembolsoMaximo) {
		this.saldoReembolsoMaximo = saldoReembolsoMaximo;
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
//	public String getEstado() {
//		return estado;
//	}
//	public void setEstado(String estado) {
//		this.estado = estado;
//	}
}