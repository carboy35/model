package cl.servel.gasto.enumerated;

public enum TipoNotificacionServEnum {
	OBSERVACION("Notificacion servel observacion", "observacion"),
	RESOLUCION("Notificacion servel resolucion", "resolucion");

	private String nombre;
	private String codigo;
	
	private TipoNotificacionServEnum(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




}
