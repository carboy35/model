package cl.servel.gasto.model;

public class TipoObservacion implements java.io.Serializable {

	private Integer tpoObsId;
	private Integer eveId;
	private Integer tpoCtaId;
	private String tpoNombreCorto;
	private String tpoDescripcion;

	public TipoObservacion() {
	}

	public TipoObservacion(Integer eveId, Integer tpoCtaId) {
		this.eveId = eveId;
		this.tpoCtaId = tpoCtaId;
	}

	public TipoObservacion(Integer eveId, Integer tpoCtaId, String tpoNombreCorto, String tpoDescripcion) {
		this.eveId = eveId;
		this.tpoCtaId = tpoCtaId;
		this.tpoNombreCorto = tpoNombreCorto;
		this.tpoDescripcion = tpoDescripcion;
	}

	public Integer getTpoObsId() {
		return tpoObsId;
	}

	public void setTpoObsId(Integer tpoObsId) {
		this.tpoObsId = tpoObsId;
	}

	public Integer getTpoCtaId() {
		return tpoCtaId;
	}

	public void setTpoCtaId(Integer tpoCtaId) {
		this.tpoCtaId = tpoCtaId;
	}

	public String getTpoNombreCorto() {
		return tpoNombreCorto;
	}

	public void setTpoNombreCorto(String tpoNombreCorto) {
		this.tpoNombreCorto = tpoNombreCorto;
	}

	public String getTpoDescripcion() {
		return tpoDescripcion;
	}

	public void setTpoDescripcion(String tpoDescripcion) {
		this.tpoDescripcion = tpoDescripcion;
	}

	public Integer getEveId() {
		return eveId;
	}

	public void setEveId(Integer eveId) {
		this.eveId = eveId;
	}
}