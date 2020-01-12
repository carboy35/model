package cl.servel.gasto.enumerated;

public enum TipoCodigoRendicionEnum {
	OF_OBVS("OFICIO OBSERVACIONES", "OF_OBVS"),
	INF_AUDIT("INFORME AUDITORIA", "INF_AUDIT"),
	RESOL("RESOLUCIONES", "RESOL"),
	MODULO_INF_AUDIT("MODULOS INFORME AUDITORIA", "MODULO_AUDI"),
	REEMBOLSO("CONFIGURA REEMBOLSO","REEMBOLSO"),
	F87("F87","F87"),
	F88("F88","F88"),
	F101("F101", "F101"),
	F102("F102", "F102"),
	F103("F103", "F103"),
	F104("F104", "F104"),
	F105("F105", "F105"),
	F106("F106", "F106"),
	F107("F107", "F107"),
	F108("F108", "F108");
	
	private String nombre;
	private String prefijoParametro;

	private TipoCodigoRendicionEnum(String nombre, String prefijoParametro) {
		this.nombre = nombre;
		this.prefijoParametro = prefijoParametro;
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

}
