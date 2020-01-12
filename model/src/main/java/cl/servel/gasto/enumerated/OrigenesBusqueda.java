package cl.servel.gasto.enumerated;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrigenesBusqueda {

	PARTIDO("partido"), 
	CANDIDATO("candidato"), 
	CANDIDATO_PARTIDO("candidatoPartido"),
	CANDIDATO_RENDICION("candidatoRendicion"),
	PARTIDO_RENDICION("partidoRendicion"),
	CANDIDATO_PARTIDO_RENDICION("candidatoPartidoRendicion"),
	RENDICION("rendicion"),
	RESPUESTA_OBSERVACION("respuestaObservacion"),
	ADMINISTRADOR("administrador"),
	CANDIDATO_PARTIDO_ADMINISTRADOR("candidatoPartidoAdministrador"),
	INGRESO_RECURSO_CANDIDATO("ingresoRecursoCandidato"),
	INGRESO_RECURSO_PARTIDO("ingresoRecursoPartido"),
	INGRESO_RECURSO_CANDIDATO_PARTIDO("ingresoRecursoCandidatoPartido"),
	CUENTA_CANDIDATO_PARTIDO("cuentaCandidatoPartido"),
	INGRESO_SENTENCIAS_TRICEL("ingresoSentenciasTricel");

	private String origen;

}
