package cl.servel.gasto.enumerated;

public enum TipoEstadoTareaEnum {
	INICIADA("INICIADA", "Iniciada", "f"),
	CANCELADA("CANCELADA", "Cancelada", "f"),
	FINALIZADA_C("FINALIZADA", "Finalizada", "f"),
	REASIGNADA("REASIGNADA", "Reasignada", "f"),
	CREADA("CREADA", "Creada", "c"),
	EN_ASIGNACION("EN_ASIGNACION", "En asignación", "c"),
	EN_REVISION("EN_REVISION", "En revisión", "c"),
	SIN_OBSERVACIONES("SIN_OBSERVACIONES", "Sin observaciones", "c"),
	CON_OBSERVACIONES("CON_OBSERVACIONES", "Con observaciones", "c"),
	CON_RESPUESTA("CON_RESPUESTA", "Con respuesta", "c"),
	FUERA_PLAZO("FUERA_PLAZO", "Fuera de plazo", "c"),
	REVISION_RESPUESTA("REVISION_RESPUESTA", "Revisión respuesta", "c"),
	RESPUESTA_ERRONEA("RESPUESTA_ERRONEA", "Respuesta erronea", "c"),
	CON_INFORME_AUDITORIA("CON_INFORME_AUDITORIA", "Con informe de auditoria", "c"),
	CON_RESOLUCION("CON_RESOLUCION", "", "c"),
	RESOLUCION_NOTIFICADA("RESOLUCION_NOTIFICADA", "Resolución notificada", "c"),
	EJECUTORIADA("EJECUTORIADA", "Ejecutoriada", "c"),
	RECLAMACION("RECLAMACION", "Reclamación", "c"),
	ENVIO_TGR("ENVIO_TGR", "Envío a TGR", "c"),
	FINALIZADA_F("FINALIZADA", "Finalizada", "c"),
	CANCELADA_POR_RESPUESTAS("CANCELADA_POR_RESPUESTAS", "Cancelada por recepción de respuestas", "c"),
	REEMBOLSO_CALCULADO("REEMBOLSO_CALCULADO", "Reembolso calculado", "c"),
	RECURSO_ACEPTADO("RECURSO_ACEPTADO", "Recurso aceptado", "c"),
	RECURSO_NO_ACEPTADO("RECURSO_NO_ACEPTADO", "Recurso no aceptado", "c");
	
	private String codigo;
	private String descripcion;
	private String tipo;

	private TipoEstadoTareaEnum(String codigo, String descripcion, String tipo) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
