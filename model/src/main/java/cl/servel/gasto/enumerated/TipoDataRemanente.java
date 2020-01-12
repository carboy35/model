package cl.servel.gasto.enumerated;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoDataRemanente {
	
	CANDIDATURAS("CANDIDATURAS"),
	GASTOS_EFECTIVOS("GASTOS_EFECTIVOS");
	
	private String nombre;
}
