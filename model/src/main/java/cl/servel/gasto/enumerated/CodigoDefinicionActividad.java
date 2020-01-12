package cl.servel.gasto.enumerated;

public enum CodigoDefinicionActividad {
	INGRESOS_GASTOS("ingresos-gastos"),
	APORTES_SRA("aportes-sra"),
	CARTOLA_BANCARIA("cartola-bancaria"),
	MANDATOS("mandatos"),
	FINANCIAMIENTO_ARTICULO_15("financiamiento-art15"),
	LIMITES_GASTOS("limites-gastos"),
	CUADRATURAS("cuadraturas"),
	DECLARACION_CANDIDATURA("declaracion-candidatura"),
	GENERAR_OFICIO_OBSERVACIONES("generar-oficio-observaciones"),
	REVISION_OBSERVACIONES("revision-observaciones");
	
	private String codigo;

	private CodigoDefinicionActividad(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
