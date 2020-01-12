package cl.servel.gasto.enumerated;

public enum DetalleIngresoEnum {
	TIPO_RECURSO("tipo_recurso",TipoCodigoEnum.INGRESO_RECURSO),
	DOCUMENTO_ADJUNTO("documento_adjunto",TipoCodigoEnum.INGRESO_RECURSO),
	MONTO("monto",TipoCodigoEnum.INGRESO_PAS),
	TIPO_MONEDA("tipo_moneda",TipoCodigoEnum.INGRESO_MULTA),
	CODIGO_MOTIVO_MULTA("codigo_motivo_multa",TipoCodigoEnum.INGRESO_MULTA),
	MONTO_MULTA("monto_multa",TipoCodigoEnum.INGRESO_MULTA);
	
	String codigo;
	TipoCodigoEnum tipoCodigoEnum;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public TipoCodigoEnum getTipoCodigoEnum() {
		return tipoCodigoEnum;
	}
	public void setCodigo(TipoCodigoEnum tipoCodigoEnum) {
		this.tipoCodigoEnum = tipoCodigoEnum;
	}
	private DetalleIngresoEnum(String codigo,TipoCodigoEnum tipoCodigoEnum) {
		this.codigo=codigo;
		this.tipoCodigoEnum=tipoCodigoEnum;
		
	}
}
