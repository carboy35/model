package cl.servel.gasto.enumerated;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CurrencySymbols {

	CL("$");
	
	private String symbol;
}