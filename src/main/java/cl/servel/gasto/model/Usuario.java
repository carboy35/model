package cl.servel.gasto.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Usuario implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NonNull private Integer usuId;
	@NonNull private String usuRut;
	@NonNull private String usuRutDv;
	@NonNull private String usuNombre;
	private Boolean usuEliminado;
	private Date created;
	private Date modified;
	@NonNull private String usuNombreAcceso;
	private Integer dexId;
	private String usuApellidoPaterno;
	private String usuApellidoMaterno;
	private Integer usuIdSubrogante;
	
}