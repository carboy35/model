package cl.servel.gasto.enumerated;

public enum EstadoNominaEnum {

	POR_ENVIAR_TGR("POR_ENVIAR_TGR", "Por enviar a la TGR"),
	ENVIADA_TGR("ENVIADA_TGR", "Enviada a la TGR"),
	PAGADA("PAGADA", "Pagada"),
	PAGADO_PARCIAL("PAGADO PARCIAL", "Pagado parcial"),
	PAGADO_TOTAL("PAGADO TOTAL", "Pagado total");
	
	private String codigo;
	private String descripcion;

	private EstadoNominaEnum(String codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
