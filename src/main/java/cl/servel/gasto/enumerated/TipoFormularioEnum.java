package cl.servel.gasto.enumerated;

public enum TipoFormularioEnum {
	FORMULARIO_F87("F87"), 
	FORMULARIO_F88("F88"),
	REEMBOLSO("REEMBOLSO"),
	PAGOS("PAGOS");
	
	private String codigo;

	private TipoFormularioEnum(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
