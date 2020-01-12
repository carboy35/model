package cl.servel.gasto.enumerated;

public enum EntidadEnum {
	RENDICION ("RenRendicion", "Rendición"),
	OBSERVACION ("ObrObservacionRendicion" , "Observación"),
	DETALLERENDICION("DetRendicion" , "DetalleRendicion"),
	CHECKLIST("Checklist", "Checklist"),
	CELULA("CelCelula", "Célula"),
	CANDIDATO("Candidato","Candidato"),
	USUARIO("Usuario","Usuario"),
	PERFIL("Perfil","Perfil"),
	ROLEUSUARIO("RoleUsuario","RoleUsuario"),
	PARAMETRO("Parametro","Parámetro"),
	DOCUMENTOEXTERNO("DexDocumentoExterno","DexDocumentoExterno"),
	DETALLEDOCUMENTOEXTERNO("DdeDetalleDocumentosExternos","DdeDetalleDocumentosExternos"),
	CMIS("CMIS","CMIS"),
	EXPEDIENTE("EXPEDIENTE", "EXPEDIENTE");

	private String nombreEntidad;
	private String descripcion;

	private EntidadEnum(String nombreEntidad, String descripcion) {
		this.nombreEntidad = nombreEntidad;
		this.descripcion = descripcion;
	}

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
