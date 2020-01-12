package cl.servel.gasto.enumerated;

public enum CodigoParametroEnum {
	TABLA("tabla", "Mi tabla"),
	MODULO_INF_AUDIT("titulo_audit","Títulos módulo informe auditoría"),
	ADJUNTO_EXPEDIENTE("adjunto_expediente", "Adjunto expediente"),
	UF("UF", "UF"),
	PAGO_MUJER("MONTO_UF_PAGO_ART_19884_MUJER", "Cantidad de UF a pagar a mujeres electas");
	
	private String codigo;
	private String descripcion;

	private CodigoParametroEnum(String codigo, String descripcion) {
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
