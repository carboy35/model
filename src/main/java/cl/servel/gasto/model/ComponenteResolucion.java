package cl.servel.gasto.model;

import java.io.Serializable;
import java.util.List;

public class ComponenteResolucion implements Serializable {
	
	private Integer idComponente;
	private String tipoComponente;
	private List<CampoResolucion> campos;
	
	public Integer getIdComponente() {
		return idComponente;
	}
	public void setIdComponente(Integer tipoComponente) {
		this.idComponente = tipoComponente;
	}
		
	public String getTipoComponente() {
		return tipoComponente;
	}
	public void setTipoComponente(String tipo) {
		this.tipoComponente = tipo;
	}
	public List<CampoResolucion> getCampos() {
		return campos;
	}
	public void setCampos(List<CampoResolucion> campos) {
		this.campos = campos;
	}	
}
