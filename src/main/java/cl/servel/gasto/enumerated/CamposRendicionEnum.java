package cl.servel.gasto.enumerated;

public enum CamposRendicionEnum {
	NUMERO_HOJA("numeroHoja"),
	FECHA_DECLARACION("fechaDeclaracion"),
	RUT("rut"),
	RUT_DV("dv"),
	NOMBRE_DONANTE("nombreDonante"),
	NOMBRE_PROVEEDOR("nombreProveedor"),
	FECHA_DOCUMENTO("fechaDocumento"),
	FECHA_DOCUMENTO_TMSTP("fechaDocumentoTmstp"),
	ID("id"),
	TIPO_RENDICION_ID("tpoRendicionId"),
	TIPO_DOC_CODIGO("tpoDocCodigo"),
	TIPO_DOC_NOMBRE("tpoDocNombre"),
	TIPO_DOCUMENTO("tipoDocumento"),
	NUMERO_DOCUMENTO("numeroDocumento"),
	TIPO_CUENTA_CODIGO("tpoCtaCodigo"),
	TIPO_CUENTA_NOMBRE("tpoCtaNombre"),
	NUMERO_CUENTA("numeroCuenta"),
	TIPO_REEMBOLSO_CODIGO("tpoReembolsoCodigo"),
	TIPO_REEMBOLSO_NOMBRE("tpoReembolsoNombre"),
	TIPO_REEMBOLSO("tipoReembolso"),
	DOCUMENTO("documento"),
	OBSERVACIONES("observaciones"),
	REVISION("revision"),
	AUTOR("autor"),
	HABILITADO("habilitado"),
	GLOSA("glosa"),
	MONTO("monto"),
	ITEMS("items"),
	TOTAL_ACUMULADO("totalAcumulado"),
	FILE_INFO("fileInfo"),
	NAME("name"),
	SIZE("size"),
	LOADED_SERVER("loadedServer"),
	FILE("file");
	
	private String nombreCampo;
	
	private CamposRendicionEnum(String nombreCampo){
		this.nombreCampo=nombreCampo;
	}
	
	public String getNombreCampo() {
		return nombreCampo;
	}

	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	
	

}
