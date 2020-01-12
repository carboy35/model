package cl.servel.gasto.model.reembolso;

import java.util.List;

public class TotalReembolsoDTO {
int totalVotos;
int maxReembolso;
TotalReembolsoDetalleMandatoDTO reCreditoMandato;
List<ReembolsoDetalleMandatoDTO> reCreditoMandatoDetalle;

TotalReembolsoDetalleCesionDTO rePartido;
TotalReembolsoDetalleDTO reCandidato;
public int getTotalVotos() {
	return totalVotos;
}
public void setTotalVotos(int totalVotos) {
	this.totalVotos = totalVotos;
}
public int getMaxReembolso() {
	return maxReembolso;
}
public void setMaxReembolso(int maxReembolso) {
	this.maxReembolso = maxReembolso;
}
public TotalReembolsoDetalleMandatoDTO getReCreditoMandato() {
	return reCreditoMandato;
}
public void setReCreditoMandato(TotalReembolsoDetalleMandatoDTO reCreditoMandato) {
	this.reCreditoMandato = reCreditoMandato;
}

public List<ReembolsoDetalleMandatoDTO> getReCreditoMandatoDetalle() {
	return reCreditoMandatoDetalle;
}
public void setReCreditoMandatoDetalle(List<ReembolsoDetalleMandatoDTO> reCreditoMandatoDetalle) {
	this.reCreditoMandatoDetalle = reCreditoMandatoDetalle;
}

public TotalReembolsoDetalleCesionDTO getRePartido() {
	return rePartido;
}
public void setRePartido(TotalReembolsoDetalleCesionDTO rePartido) {
	this.rePartido = rePartido;
}
public TotalReembolsoDetalleDTO getReCandidato() {
	return reCandidato;
}
public void setReCandidato(TotalReembolsoDetalleDTO reCandidato) {
	this.reCandidato = reCandidato;
}

}
