package cl.servel.gasto.model;

import java.util.Date;

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
public class Perfil{

	private Integer perId;
	private String perNombrePerfil;
	private boolean perEliminado;
	private Date created;
	private Date modifiead;
	private String perCodigoPerfil;

}
