package cl.servel.gasto.model;

import java.io.Serializable;

public class ObjetoBaseCodigoDTO implements Serializable{
	private String codigo;
	private String descripcion;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ObjetoBaseCodigoDTO(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	public ObjetoBaseCodigoDTO(String codigo) {
		super();
		this.codigo = codigo;
	}


	public ObjetoBaseCodigoDTO() {}
	
	
}
