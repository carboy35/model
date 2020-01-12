package cl.servel.gasto.model;

import org.apache.commons.lang3.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CandidatoLiviano{
	
	private EventoEleccionarioLiviano evento;
	private Integer canId;
	private String canNombres;
	private String canAppPaterno;
	private String canAppMaterno;
	private Integer canRut;
	private String canRutDv;
	private Boolean canHabilitado;

}
