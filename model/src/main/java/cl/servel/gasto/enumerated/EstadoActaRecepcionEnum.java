package cl.servel.gasto.enumerated;

public enum EstadoActaRecepcionEnum {
	GENERADA(1, "Generada"), IMPRESA(2, "Impresa");

	private int id;
	private String descripcion;

	private EstadoActaRecepcionEnum(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
