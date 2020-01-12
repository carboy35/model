package cl.servel.gasto.enumerated;

public enum MensajesRespuestaEnum {
	CARGA_DUPLICADA("Se ha detectado una carga de límites duplicada para la elección"),
	GENERACION_LIMITES_EXITOSA("Generación de cálculo de límites exitosa"),
	ERROR_GENERAR_LIMITES("Ocurrió un error al generar limites candidato"),
	ERROR_PARTIDO_NULO("Se encontró candidato afiliado o asociado sin partido");
String mensaje;

public String getMensaje() {
	return mensaje;
}

public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}

MensajesRespuestaEnum(String mensaje){
	this.mensaje=mensaje;
}
}
