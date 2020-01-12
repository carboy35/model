package cl.servel.gasto.enumerated;

public enum TipoPagoEnum {
PAGO_MUJER("PAGO_MUJER"), 
PAGO_REMANENTE("PAGO_REMANENTE"),
REEMBOLSO_CREDITO_CON_MANDATO("REEMBOLSO_CREDITO_CON_MANDATO"),
REEMBOLSO_PARTIDO_CESION_DERECHOS("REEMBOLSO_PARTIDO_CESION_DERECHOS"),
REEMBOLSO_CANDIDATO_PARTIDO("REEMBOLSO_CANDIDATO_PARTIDO");

private String codigo;

private TipoPagoEnum(String codigo) {
	this.codigo = codigo;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}
}