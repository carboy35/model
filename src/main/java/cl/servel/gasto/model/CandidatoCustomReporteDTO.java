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
public class CandidatoCustomReporteDTO {
	private CandidatoCustomDTO candidato;
	private ObjetoBaseDTO tipoCandidatura;
	private int partidoId;
	private ObjetoBaseDTO territorioElectoral;
}
