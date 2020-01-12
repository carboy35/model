package cl.servel.gasto.enumerated;

public enum CodigoOrigenTareaEnum {
	REVISION_SUBDIRECCION("revision-subdireccion", CodigosFlujosEnum.REVISION_RENDICION),
	GENERACION_OFICIO_OBSERVACION("generacion-oficio-observacion", CodigosFlujosEnum.REVISION_RENDICION),
	REVISION_RESPUESTA_ERRONEA("revision-respuesta-erronea", CodigosFlujosEnum.REVISION_RENDICION),
	REVISION_RESPUESTA_2("revision-respuesta-2", CodigosFlujosEnum.REVISION_RENDICION),
	INFORME_AUDITORIA_1("informe-auditoria-1", CodigosFlujosEnum.REVISION_RENDICION),
	RESOLUCION_1("resolucion-1", CodigosFlujosEnum.REVISION_RENDICION),
	RESOLUCION_6("resolucion-6", CodigosFlujosEnum.REVISION_RENDICION),
	NOTIFICACIONES_RESOLUCIONES("notificaciones-resoluciones", CodigosFlujosEnum.REVISION_RENDICION),
	REVISION_RESPUESTA_1("revision-respuesta-1", CodigosFlujosEnum.REVISION_RENDICION),
	RESOLUCION_EJECUTORIADA("resolucion-ejecutoriada", CodigosFlujosEnum.REVISION_RENDICION),
	CALCULO_REEMBOLSO_1("calculo-reembolso-1", CodigosFlujosEnum.REVISION_RENDICION),
	CALCULO_REEMBOLSO_2("calculo-reembolso-2", CodigosFlujosEnum.REVISION_RENDICION),
	REP_CALCULO_REEMBOLSO_1("rep-calculo-reembolso-1", CodigosFlujosEnum.REVISION_RENDICION),
	REP_INFORME_AUDITORIA_1("rep-informe-auditoria-1", CodigosFlujosEnum.REVISION_RENDICION),
	REP_RESOLUCION_1("rep-resolucion-1", CodigosFlujosEnum.REVISION_RENDICION),
	REP_RESOLUCION_6("rep-resolucion-6", CodigosFlujosEnum.REVISION_RENDICION),
	REP_REVISION_CALCULO("rep-revision-calculo", CodigosFlujosEnum.REVISION_RENDICION),
	REVISION_1("revision-1",CodigosFlujosEnum.REVISION_RENDICION);
	

	private String codigoOrigen;
	private CodigosFlujosEnum codigoFlujo;

	private CodigoOrigenTareaEnum(String codigoOrigen, CodigosFlujosEnum codigoFlujo) {
		this.codigoOrigen = codigoOrigen;
		this.codigoFlujo = codigoFlujo;
	}

	public String getCodigoOrigen() {
		return codigoOrigen;
	}

	public void setCodigoOrigen(String codigoOrigen) {
		this.codigoOrigen = codigoOrigen;
	}

	public CodigosFlujosEnum getCodigoFlujo() {
		return codigoFlujo;
	}

	public void setCodigoFlujo(CodigosFlujosEnum codigoFlujo) {
		this.codigoFlujo = codigoFlujo;
	}

}
