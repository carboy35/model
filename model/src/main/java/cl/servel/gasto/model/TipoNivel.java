package cl.servel.gasto.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TipoNivel{

	private String tpoNivCodigo;
	private String tpoNivDescripcion;
	private Date tpoNivCreated;
	private Date tpoNivModified;
	private Boolean tpoNivEliminado;
	
	public String getTpoNivCodigo() {
		return tpoNivCodigo;
	}
	public void setTpoNivCodigo(String tpoNivCodigo) {
		this.tpoNivCodigo = tpoNivCodigo;
	}
	public String getTpoNivDescripcion() {
		return tpoNivDescripcion;
	}
	public void setTpoNivDescripcion(String tpoNivDescripcion) {
		this.tpoNivDescripcion = tpoNivDescripcion;
	}
	public Date getTpoNivCreated() {
		return tpoNivCreated;
	}
	public void setTpoNivCreated(Date tpoNivCreated) {
		this.tpoNivCreated = tpoNivCreated;
	}
	public Date getTpoNivModified() {
		return tpoNivModified;
	}
	public void setTpoNivModified(Date tpoNivModified) {
		this.tpoNivModified = tpoNivModified;
	}
	public Boolean getTpoNivEliminado() {
		return tpoNivEliminado;
	}
	public void setTpoNivEliminado(Boolean tpoNivEliminado) {
		this.tpoNivEliminado = tpoNivEliminado;
	}

	
}
