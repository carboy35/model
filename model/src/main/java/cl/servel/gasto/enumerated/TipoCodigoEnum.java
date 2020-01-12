package cl.servel.gasto.enumerated;

public enum TipoCodigoEnum {
	INGRESO_RECURSO("INGRESO_RECURSO", TipoEnum.INGRESO),
	INGRESO_PAS("INGRESO_PAS", TipoEnum.INGRESO),
	INGRESO_MULTA("INGRESO_MULTA", TipoEnum.INGRESO),
	INGRESO_SENTENCIAS_TRICEL("INGRESO_SENTENCIAS_TRICEL", TipoEnum.INGRESO),
	PAGO_REEMBOLSO("PAGO_REEMBOLSO", TipoEnum.NOMINA),
	PAGO_MUJER("PAGO_MUJER", TipoEnum.NOMINA),
	PAGO_REMANENTE("PAGO_REMANENTE", TipoEnum.NOMINA),
	COBRO_MULTA("COBRO_MULTA", TipoEnum.NOMINA),
	CLP("CLP", TipoEnum.MONEDA),
	UTM("UTM", TipoEnum.MONEDA),
	UF("UF", TipoEnum.MONEDA),
	REEMBOLSO_PARTIDO_CESION_DERECHOS("REEMBOLSO_PARTIDO_CESION_DERECHOS",  TipoEnum.NOMINA),
	REEMBOLSO_CANDIDATO_PARTIDO("REEMBOLSO_CANDIDATO_PARTIDO", TipoEnum.NOMINA),
	REEMBOLSO_CREDITO_CON_MANDATO("REEMBOLSO_CREDITO_CON_MANDATO", TipoEnum.NOMINA);

	private String codigo;
	private TipoEnum tipoEnum;

	private TipoCodigoEnum(String codigo, TipoEnum tipoEnum) {
		this.codigo = codigo;
		this.tipoEnum = tipoEnum;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public TipoEnum getTipoEnum() {
		return tipoEnum;
	}

	public void setTipoEnum(TipoEnum tipoEnum) {
		this.tipoEnum = tipoEnum;
	}
}
