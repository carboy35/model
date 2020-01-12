package cl.servel.gasto.model;

import java.io.Serializable;
import java.util.List;

public class EstructuraResolucion implements Serializable {

	private Integer idEstructuraResolucion;
	
	private String tipoEstructuraResolucion;
	private String nombreEstructuraResolucion;
	private String descripcionEstructuraResolucion;
	
	private List<ComponenteResolucion> componentes;
	
	public Integer getIdEstructuraResolucion() {
		return idEstructuraResolucion;
	}
	public void setIdEstructuraResolucion(Integer idEstructuraResolucion) {
		this.idEstructuraResolucion = idEstructuraResolucion;
	}	
	public String getTipoEstructuraResolucion() {
		return tipoEstructuraResolucion;
	}
	public void setTipoEstructuraResolucion(String tipoEstructuraResolucion) {
		this.tipoEstructuraResolucion = tipoEstructuraResolucion;
	}
	public String getNombreEstructuraResolucion() {
		return nombreEstructuraResolucion;
	}
	public void setNombreEstructuraResolucion(String nombreEstructuraResolucion) {
		this.nombreEstructuraResolucion = nombreEstructuraResolucion;
	}
	public String getDescripcionEstructuraResolucion() {
		return descripcionEstructuraResolucion;
	}
	public void setDescripcionEstructuraResolucion(String descripcionEstructuraResolucion) {
		this.descripcionEstructuraResolucion = descripcionEstructuraResolucion;
	}
	public List<ComponenteResolucion> getComponentes() {
		return componentes;
	}
	public void setComponentes(List<ComponenteResolucion> componentes) {
		this.componentes = componentes;
	}	
}
