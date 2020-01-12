package cl.servel.gasto.enumerated;

public enum OrigenRendicionEnum {
	SCG ("Sistema de control de gastos"),
	RENDICION_WEB ("Rendición WEB");
	
	private String descripcion;

	private OrigenRendicionEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
