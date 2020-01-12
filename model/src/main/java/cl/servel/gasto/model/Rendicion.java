package cl.servel.gasto.model;
// Generated 02-01-2019 19:29:27 by Hibernate Tools 5.2.11.Final

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Rendicion implements Serializable {

	private int idRendicion;
	private int idCandidato;
	private int idEvento;
	private int idEleccion;
	private int idPartido;
	private int idTipoRendicion;
	private String tipoRendicion;
	private int numeroRendicion;
	private Date fecha;
	private String estado;
	private long total;
	private int numeroDocumento;
	private String fechaFormat;
	private int totalLineas;
	private String lineasRevisadas;
	
	public int getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	public int getIdRendicion() {
		return idRendicion;
	}
	public void setIdRendicion(int idRendicion) {
		this.idRendicion = idRendicion;
	}
	public int getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public int getIdEleccion() {
		return idEleccion;
	}
	public void setIdEleccion(int idEleccion) {
		this.idEleccion = idEleccion;
	}
	public int getIdTipoRendicion() {
		return idTipoRendicion;
	}
	public void setIdTipoRendicion(int idTipoRendicion) {
		this.idTipoRendicion = idTipoRendicion;
	}
	public String getTipoRendicion() {
		return tipoRendicion;
	}
	public void setTipoRendicion(String tipoRendicion) {
		this.tipoRendicion = tipoRendicion;
	}
	public int getNumeroRendicion() {
		return numeroRendicion;
	}
	public void setNumeroRendicion(int numeroRendicion) {
		this.numeroRendicion = numeroRendicion;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public int getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		if (fecha != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			setFechaFormat(sdf.format(fecha));
		}
		
		this.fecha = fecha;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public String getFechaFormat() {
		return fechaFormat;
	}
	public void setFechaFormat(String fechaFormat) {
		
		this.fechaFormat = fechaFormat;
	}
	public int getTotalLineas() {
		return totalLineas;
	}
	public void setTotalLineas(int totalLineas) {
		this.totalLineas = totalLineas;
	}
	public String getLineasRevisadas() {
		return lineasRevisadas;
	}
	public void setLineasRevisadas(String lineasRevisadas) {
		this.lineasRevisadas = lineasRevisadas;
	}
	
	

}
