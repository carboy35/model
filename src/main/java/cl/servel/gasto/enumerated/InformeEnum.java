package cl.servel.gasto.enumerated;

public enum InformeEnum {
	OBSERVACIONES_CAND("Informe de observaciones Candidato", "CAN_INF-OBSERVACIONES_", ""),
	OBSERVACIONES_PART("Informe de observaciones Partido", "PAR_INF-OBSERVACIONES_", ""),
	OBSERVACIONES_FIRMA("Firma Informe de observaciones", "FIR_OBSERV", ""),
	AUDITORIA_CAND("Informe de auditoria Candidato", "CAN_INF-AUDITORIA_", ""),
	AUDITORIA_PART("Informe de auditoria Partido", "PAR_INF-AUDITORIA", ""),

	RESOLUCIONES_CAND("Informe de resoluciones Candidato", "CAN_RESOLUCION_", ""),
	RESOLUCIONES_PART("Informe de resoluciones Partido", "PAR_RESOLUCION_", ""),
	
	INF_OBSERVACIONES("Informe de observaciones", "INF-OBSERVACIONES", "CUENTA"),
	INF_AUDITORIA("Informe auditoría", "INF-AUDITORIA", "CUENTA"),
	INF_RESOLUCIONES("Informe resoluciones", "INF-RESOLUCIONES", "CUENTA"),
	INF_RESOLUCIONES_CALCULO("Informe resoluciones cálculo", "INF_RESOLUCIONES_CALCULO", "GENERAL"),
	INF_RESOLUCIONES_MUJER("Informe resoluciones pago mujer", "INF-RESOLUCIONES_MUJER", "GENERAL"),
	INF_RESOLUCIONES_REMANENTE("Informe resoluciones", "INF-RESOLUCIONES_REMANENTE", "GENERAL"),
	INF_RESUMEN_PARTIDO("Informe resumen partido remanentes", "INF_RESUMEN_PARTIDO", "GENERAL"),
	INF_AUDITORIA_RECALCULO("Informe auditoría recálculo", "INF-AUDITORIA_RECALCULO", "CUENTA"),
	INF_RESOLUCIONES_RECALCULO("Informe resoluciones recálculo", "INF-RESOLUCIONES_RECALCULO", "CUENTA"),
	
	NOTIFICACION_RESOLUCIONES("Notificacion de resoluciones", "NOTIF_RESOLUCIONES", "");

	private String nombre;
	private String prefijoParametro;
	private String tipo;
	
	private InformeEnum(String nombre, String prefijoParametro, String tipo) {
		this.nombre = nombre;
		this.prefijoParametro = prefijoParametro;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrefijoParametro() {
		return prefijoParametro;
	}

	public void setPrefijoParametro(String prefijoParametro) {
		this.prefijoParametro = prefijoParametro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}
