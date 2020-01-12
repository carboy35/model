package cl.servel.gasto.model;

import cl.servel.gasto.model.ObjetoBaseDTO;

public class CandidatoCustomDTO extends ObjetoBaseDTO {
	private String rut;
	private Double monto;
	private Integer montoRemanente;
	private Integer votos;
	private Integer maximoReembolso;
	private Integer reembolsoAutorizado;
	private Integer saldoReembolso;
	private Integer montoGastoEfectivo;





	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Integer getMontoRemanente() {
		return montoRemanente;
	}

	public void setMontoRemanente(Integer montoRemanente) {
		this.montoRemanente = montoRemanente;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

	public Integer getMaximoReembolso() {
		return maximoReembolso;
	}

	public void setMaximoReembolso(Integer maximoReembolso) {
		this.maximoReembolso = maximoReembolso;
	}

	public Integer getReembolsoAutorizado() {
		return reembolsoAutorizado;
	}

	public void setReembolsoAutorizado(Integer reembolsoAutorizado) {
		this.reembolsoAutorizado = reembolsoAutorizado;
	}

	public Integer getSaldoReembolso() {
		return saldoReembolso;
	}

	public void setSaldoReembolso(Integer saldoReembolso) {
		this.saldoReembolso = saldoReembolso;
	}
	
	public Integer getMontoGastoEfectivo() {
		return montoGastoEfectivo;
	}

	public void setMontoGastoEfectivo(Integer montoGastoEfectivo) {
		this.montoGastoEfectivo = montoGastoEfectivo;
	}

	public CandidatoCustomDTO() {
		super();
	}
	public CandidatoCustomDTO(int id,String nombre,String rut,Double monto,Integer montoRemanente,Integer votos,Integer maximoReembolso,Integer reembolsoAutorizado,Integer saldoReembolso,Integer montoGastoEfectivo) {
		super.setId(id);
		super.setNombre(nombre);
		this.setRut(rut);
		this.setMonto(monto);
		this.setMontoRemanente(montoRemanente);
		this.setVotos(votos);
		this.setMaximoReembolso(maximoReembolso);
		this.setReembolsoAutorizado(reembolsoAutorizado);
		this.setSaldoReembolso(saldoReembolso);
		this.setMontoGastoEfectivo(montoGastoEfectivo);
	}
}
