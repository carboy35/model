package cl.servel.gasto.enumerated;

public enum EstadoReembolsoEnum {
	CREADO("CREADO"),
	CONGELADO("CONGELADO"),
	CONGELADO_PARCIAL("CONGELADO_PAR"),
	DESCONGELADO("DESCONGELADO");

	private String estado;

	private EstadoReembolsoEnum(String estado) 
	{
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
}
