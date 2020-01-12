package cl.servel.gasto.enumerated;

public enum EstadoRendicionEnum {
	CREADO("CREADO"),
	ENVIADO("ENVIADO"),
	EN_ASIGNACION("EN_ASIGNACION"),
	EN_REVISION("EN_REVISION"),
	REVISADO("REVISADO"),
	CONGELADO("CONGELADO"),
	CONGELADO_PARCIAL("CONGELADO_PAR"),
	DESCONGELADO("DESCONGELADO");

	private String estado;

	private EstadoRendicionEnum(String estado) 
	{
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
}
