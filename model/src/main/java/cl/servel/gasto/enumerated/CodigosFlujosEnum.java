package cl.servel.gasto.enumerated;

public enum CodigosFlujosEnum {
	REVISION_RENDICION("REVISION_RENDICION", "Revision rendición");

	private String codigo;
	private String descripcion;

	private CodigosFlujosEnum(String codigo, String descripcion) {
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
