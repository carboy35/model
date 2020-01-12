package cl.servel.gasto.enumerated;

public enum TipoEventoEnum {
PRECANDIDATURA("1"),
PRIMARIA("2"),
DEFINITIVA("3"),
SEGUNDA_VOTACION("4");
	
private String codigo;

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

private TipoEventoEnum(String codigo) {
	this.codigo=codigo;
}

}
