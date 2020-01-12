package cl.servel.gasto.model;

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
public class AdmAdministradorElectoralLiviano {
	private EventoEleccionarioLiviano evento;
	private Integer admId;
	private String admNombre;
	private String admAppPaterno;
	private String admAppMaterno;
	private String admRut;
	private String admRutDv;
}
