package cl.servel.gasto.enumerated;

public enum TipoPersonaEnum {
	N("N"),
	J("J");
	String codigo;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	TipoPersonaEnum(String codigo){
		this.codigo=codigo;
	}
}
