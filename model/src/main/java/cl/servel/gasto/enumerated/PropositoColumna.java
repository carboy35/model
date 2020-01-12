package cl.servel.gasto.enumerated;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PropositoColumna {

	ESTADO("estado"),
	ID("id"),
	IDRLCA("idrlca"),
	ENTITYIDRLCA("entityidrlca");
	
	private String proposito;
}
