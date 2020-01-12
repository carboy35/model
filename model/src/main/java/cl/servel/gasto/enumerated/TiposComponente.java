package cl.servel.gasto.enumerated;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TiposComponente {
	
	TITULO("titulo"),
	PARRAFOCORTO("parrafocorto"),
	PARRAFOLARGOSN("parrafolargosn"),
	PARRAFOLARGOCN("parrafolargocn"),
	PARRAFOLARGOCNTITULO("parrafolargocntitulo"),
	PARRAFOTEMPLATECN("parrafotemplatecn"),
	PARRAFOOPCIONAL("parrafoopcional"),
	FIRMA("firma"),
	DISTRIBUCION("distribucion"),
	TABLA("tabla"),
	PAGEBREAK("pageBreak"),
	FIRMADERECHA("firmaderecha");
	private String nombre;
	
}
