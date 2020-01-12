package cl.servel.gasto.model;

import java.io.Serializable;

public class ObjetoBaseDTO implements Serializable{

	private int id;
	private String nombre;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ObjetoBaseDTO(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public ObjetoBaseDTO() {}
	
	
}
