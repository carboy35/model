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
public class Expediente {
	private Integer exId;
	private Integer canId;
	private Integer dexId;
	private Integer parId;
	private Date fechaCreacion;
	private String exNroFolio;
}
