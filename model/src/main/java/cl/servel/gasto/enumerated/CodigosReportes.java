package cl.servel.gasto.enumerated;

public enum CodigosReportes {
	PAGOS_MULTAS("PAGOS_MULTAS"),
	INGRESOS_GASTOS("INGRESOS_GASTOS"),
	WORKFLOW("WORKFLOW"),
	MOVIMIENTOS("MOVIMIENTOS");
	
	private String codigo;

	private CodigosReportes(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	} 
}
