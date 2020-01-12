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
public class RlcPerfilRolUsuario {

	private Integer rlcId;
	private Integer perId;
	private Integer rolId;
}
