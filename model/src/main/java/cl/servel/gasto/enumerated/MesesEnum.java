package cl.servel.gasto.enumerated;

public enum MesesEnum {
	ENERO(0, "enero"), 
	FEBRERO(1, "febrero"), 
	MARZO(2, "marzo"), 
	ABRIL(3, "abril"), 
	MAYO(4, "mayo"), 
	JUNIO(5, "junio"),
	JULIO(6, "julio"),
	AGOSTO(7, "agosto"),
	SEPTIEMBRE(8, "septiembre"),
	OCTUBRE(9, "octubre"),
	NOVIEMBRE(10, "noviembre"),
	DICIEMBRE(11, "diciembre");

	private int id;
	private String descripcion;

	private MesesEnum(int id, String descripcion) {
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