package cl.servel.gasto.model;

import java.util.List;

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
public class PartidoPagoDTO {
int oficio;
int partidoId;
int detalleNominaId;
int	 gastoEfectivo;
int remanenteDeterminado;
int montoTotal;
boolean pagado;
List<CandidatoDetallePagoDTO> listaCandidatos;
List<EleccionGastoEfectivoDTO> listaElecciones;
}
