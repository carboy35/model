package cl.servel.gasto.enumerated;

public enum AccionBitacoraEnum {
	REINTENTO("Reintento"),
	ELIMINAR("Eliminar"),
	GUARDAR("Guardar"),
	EDITAR("Editar"),
	DESACTIVAR("Desactivar"),
	BK_A_RECOM("Backup antes de recomendación del auditor"),
	BK_A_REVIS("Backup antes de revisión preliminar"),
	CB_ESTADO("Cambio de estado");
	private String descripcion;

	private AccionBitacoraEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
