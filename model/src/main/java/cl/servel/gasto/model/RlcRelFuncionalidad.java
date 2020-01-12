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
public class RlcRelFuncionalidad {

	private Integer rlcId;
	private Integer funIdPadre;
	private Integer funIdHijo;
	private Integer rlcOrdenPresedencia;
}
