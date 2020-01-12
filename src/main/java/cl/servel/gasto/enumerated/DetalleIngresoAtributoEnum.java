package cl.servel.gasto.enumerated;

public enum DetalleIngresoAtributoEnum {
	MONTO("monto"),
	FECHA("fecha"),
	APLICA_RECURSO("aplicaRecurso"),
	DEX_ID("documento"),
	TIPO_RECURSO("tipoRecurso");
			
	private String nombre;

	private DetalleIngresoAtributoEnum(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
