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
public class CandidatoDetallePagoDTO {
int id;
int monto;
int montoRemanente;
int votos;
int maximoReembolso;
int reembolsoAutorizado;
int saldoReembolso;
}
