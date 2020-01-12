package cl.servel.gasto.enumerated;

public enum TipoEnum {
	NOMINA("NOMINA"),
	INGRESO("INGRESO"),
	MONEDA("MONEDA"),
	MULTA("COD_MULTA");
	
	String codigo;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	private TipoEnum(String codigo) {
		this.codigo=codigo;
		
	}
}
