package cl.servel.gasto.enumerated;

public enum TipoReembolsoEnum {
	CESION_DERECHOS("P"), 
	CANDIDATO("C");
	
	private String codigo;

	private TipoReembolsoEnum(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
