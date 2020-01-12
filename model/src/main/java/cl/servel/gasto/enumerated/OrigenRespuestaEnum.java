package cl.servel.gasto.enumerated;

public enum OrigenRespuestaEnum {
	SCG ("Sistema de control de gastos"),
	WEB ("WEB");
	
	private String descripcion;

	private OrigenRespuestaEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
