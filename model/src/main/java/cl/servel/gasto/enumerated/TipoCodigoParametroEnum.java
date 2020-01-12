package cl.servel.gasto.enumerated;

public enum TipoCodigoParametroEnum {
	FERIADO("fer","Feriados");

	private String codigo;
	private String descripcion;

	private TipoCodigoParametroEnum(String codigo, String descripcion) {
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
