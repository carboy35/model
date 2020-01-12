package cl.servel.gasto.enumerated;

public enum NombreTpoSeccionRendicionEnum {
	PARRAFO("PARRAFO", "Párrafos para informes"),
	MODULOS_INF_AUDITORIA("MODULOS_INF_AUDITORIA", "Módulos para informe auditoría"),
	RE_CREDITO_MANDATO("reCreditoMandato"," Tabla crédito mandato"),
	RE_CREDITO_MANDATO_DETALLE("reCreditoMandatoDetalle"," Tabla detalle crédito mandato"),
	
	RE_CANDIDATO("reCandidato","Tabla reembolso solicitado"),
	RE_PARTIDO("rePartido","Tabla cesión de derechos"),
	TOTAL_REEMBOLSO("totalReembolso","Totales reembolso");
			
	private String codigo;
	private String descripcion;

	private NombreTpoSeccionRendicionEnum(String codigo, String descripcion) {
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
