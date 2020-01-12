package cl.servel.gasto.model;
// Generated 02-01-2019 19:29:27 by Hibernate Tools 5.2.11.Final

import java.io.Serializable;
import java.util.Date;

public class DetalleRendicion implements Serializable {

	private Integer detId;
	private Integer rendicionId;
	private Integer tpoSeccionRendicionId;
	private String valor;
	private Integer detLineaDetalle;
	private String valorPresentado;
	private String detValorPreCalculoReembolso;
	private String detValorCalculoReembolsoPrimeraInstancia;
	public Integer getDetId() {
		return detId;
	}

	public void setDetId(Integer detId) {
		this.detId = detId;
	}

	public Integer getRendicionId() {
		return rendicionId;
	}

	public void setRendicionId(Integer rendicionId) {
		this.rendicionId = rendicionId;
	}

	public Integer getTpoSeccionRendicionId() {
		return tpoSeccionRendicionId;
	}

	public void setTpoSeccionRendicionId(Integer tpoSeccionRendicionId) {
		this.tpoSeccionRendicionId = tpoSeccionRendicionId;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Integer getDetLineaDetalle() {
		return detLineaDetalle;
	}

	public void setDetLineaDetalle(Integer detLineaDetalle) {
		this.detLineaDetalle = detLineaDetalle;
	}

	public String getValorPresentado() {
		return valorPresentado;
	}

	public void setValorPresentado(String valorPresentado) {
		this.valorPresentado = valorPresentado;
	}

	public String getDetValorPreCalculoReembolso() {
		return detValorPreCalculoReembolso;
	}

	public void setDetValorPreCalculoReembolso(String detValorPreCalculoReembolso) {
		this.detValorPreCalculoReembolso = detValorPreCalculoReembolso;
	}

	public String getDetValorCalculoReembolsoPrimeraInstancia() {
		return detValorCalculoReembolsoPrimeraInstancia;
	}

	public void setDetValorCalculoReembolsoPrimeraInstancia(String detValorCalculoReembolsoPrimeraInstancia) {
		this.detValorCalculoReembolsoPrimeraInstancia = detValorCalculoReembolsoPrimeraInstancia;
	}

}
