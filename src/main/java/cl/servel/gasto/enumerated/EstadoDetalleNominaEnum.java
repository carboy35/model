package cl.servel.gasto.enumerated;

public enum EstadoDetalleNominaEnum {
	ENVIADA_TGR("ENVIADA_TGR"),
	POR_ENVIAR_TGR("POR_ENVIAR_TGR");

	private String estado;

	private EstadoDetalleNominaEnum(String estado) 
	{
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
}
