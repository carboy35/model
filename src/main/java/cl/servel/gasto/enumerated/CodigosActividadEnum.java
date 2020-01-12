package cl.servel.gasto.enumerated;

public enum CodigosActividadEnum {

	CHECKLIST("CHECKLIST", "Checklist"),
	LINEAS_REVISADAS_87("LINEAS_REVISADAS_87", "Lineas revisadas F87"),
	LINEAS_REVISADAS_88("LINEAS_REVISADAS_88", "Lineas revisadas F88"),
	CAMBIO_ESTADO_OBSERVACIONES("CAMBIO_ESTADO_OBSERVACIONES", "Para evaluar si la tarea ejecuta cambio estado observaciones"),
	VIS_OBSERV("VIS_OBSERV","Visado Observaciones"),
	FIR_OBSERV("FIR_OBSERV","Firma Observaciones"),
	VIS_RESOLUCIONES("VIS_RESOLUCIONES","Visado Resoluciones"),
	FIR_RESOLUCIONES("FIR_RESOLUCIONES","Firma Resoluciones"),
	VIS_AUDITORIA("VIS_AUDITORIA","Visado Auditoría"),
	FIR_AUDITORIA("FIR_AUDITORIA","Firma Auditoría"),
	REV_AUDITORIA("REV_AUDITORIA","Revisa Auditoría"),
	NOTIFICA_RESOLUCIONES("NOTIFICA_RESOLUCIONES", "Notifica Resoluciones"), 
	NOTIFICA_RESOLUCIONES_2("NOTIFICA_RESOLUCIONES_2", "Notifica Resoluciones"),
	NOTIFICA_INFORME_AUDITORIA("NOTIFICA_INFORME_AUDITORIA", "Notifica informe de auditoria"),
	NOTIFICA_INFORME_AUDITORIA_2("NOTIFICA_INFORME_AUDITORIA_2", "Notifica informe de auditoria"),
	NOTIFICA_INFORME_OBSERVACION("NOTIFICA_INFORME_OBSERVACION", "Notifica informe de observaciones"),
	CALCULO_PAS("calculo-pas","Calculo pass"),
	RESPALDA_DETALLE_RENDICION("RESPALDA_DETALLE_RENDICION", "Indica si se debe respaldar el detalle de la rencición"),
	REINICIA_CALCULO_REEMBOLSO("REINICIA_CALCULO_REEMBOLSO", "Define en que momento se debe reiniciar el cálculo de los reembolsos"),
	NOTIFICA_OBSERVACIONES_SERVEL("NOTIFICA_OBSERVACIONES_SERVEL","Notifica observaciones a servel"),
	NOTIFICA_RESOLUCIONES_SERVEL("NOTIFICA_RESOLUCIONES_SERVEL","Notifica resoluciones a servel");
	
	private String codigo;
	private String descripcion;

	private CodigosActividadEnum(String codigo, String descripcion) {
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
