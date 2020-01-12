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
public class PartidoLiviano{

	private EventoEleccionarioLiviano evento;
	private Integer parId;
	private Boolean parEliminado;
    private String parSigla;
    private String parNombre;
    private String parRut;
    
}
