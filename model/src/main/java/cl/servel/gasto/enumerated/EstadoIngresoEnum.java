package cl.servel.gasto.enumerated;

public enum EstadoIngresoEnum {
	CONGELA_PARCIAL("CONGELA_PARCIAL"),
	DESCONGELADO("DESCONGELADO");

	private String nombre;

	private EstadoIngresoEnum(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
