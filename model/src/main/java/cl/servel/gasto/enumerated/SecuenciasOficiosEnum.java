package cl.servel.gasto.enumerated;

public enum SecuenciasOficiosEnum {
	SEQ_EXPEDIENTE("SEQ_INFORME_AUDITORIA"),
	SEQ_INFORME_AUDITORIA("SEQ_INFORME_AUDITORIA"),
	SEQ_OFICIO_OBSERVACION("SEQ_OFICIO_OBSERVACION"),
	SEQ_RESOLUCIONES("SEQ_RESOLUCIONES"),
	SEQ_PAGO_MUJER("SEQ_PAGO_MUJER"),
	SEQ_PAGO_REMANENTES("SEQ_PAGO_REMANENTES");
	
	String codigo;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	private SecuenciasOficiosEnum(String codigo) {
		this.codigo=codigo;
		
	}

}
