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
public class RelUsuarioPerfil implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rlcId;
	private int idUsuario;
	private int idPerfil;
	private boolean perEliminado;
	
}