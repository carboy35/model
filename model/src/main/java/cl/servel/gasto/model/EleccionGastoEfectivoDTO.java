package cl.servel.gasto.model;

import java.util.List;

import cl.servel.gasto.model.EleccionLiviano.EleccionLivianoBuilder;
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
public class EleccionGastoEfectivoDTO {
	int partidoId;
	int eleccionId;
	int detalleNominaId;
	String tipoEleccion;
	int gastoEfectivo;
	int remanenteDeterminado;
	int montoRemanente;
	List<CandidatoCustomDTO> candidato;
}
