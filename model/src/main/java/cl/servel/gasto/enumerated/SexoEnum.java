package cl.servel.gasto.enumerated;

public enum SexoEnum {
	HOMBRE("HOMBRE"), 
	MUJER("MUJER");

	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private SexoEnum(String nombre) {
		this.nombre = nombre;
	}
}
