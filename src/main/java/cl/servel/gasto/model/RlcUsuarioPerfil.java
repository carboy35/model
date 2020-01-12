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
public class RlcUsuarioPerfil {

	private Integer rlcId;
	private int perId;
	private Integer usuId;
	private Boolean eliminado;
}
