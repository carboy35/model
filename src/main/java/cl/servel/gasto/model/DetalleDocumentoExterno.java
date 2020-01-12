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
public class DetalleDocumentoExterno{
	
	private Integer ddeId;
	private Integer dexId;
	private String ddeNombreDocumento;
	private String ddeMimeType;
	private String ddeIdRepositorioDocumental;
	private Date ddeCreated;
	private String ddeTipoDocumento;
	private String folio;
}
