package cl.servel.gasto.enumerated;

public enum TipoAporteEnum {
	LIM_MAX_PERSONA(1, "LÍMITE MÁXIMO PERSONA"), 
	LIM_MAX_APORTE_SIN_PUB(2, "LÍMITE MÁXIMO APORTE SIN PUBLICIDAD"), 
	LIM_MAX_APORTE_PER_CAN(3, "LÍMITE MÁXIMO APORTE PERSONAL CANDIDATO");

	private int id;
	private String descripcion;

	private TipoAporteEnum(int id, String descripcion) {
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
