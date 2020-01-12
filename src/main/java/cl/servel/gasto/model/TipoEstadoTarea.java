package cl.servel.gasto.model;

public class TipoEstadoTarea {

	private Integer tpoTareaId;
	private String tpoCodigoEstado;
	private String tpoNombreEstado;
	private String tpoTipoEstado;

	public TipoEstadoTarea() {
	}

	public TipoEstadoTarea(Integer tpoTareaId, String tpoCodigoEstado, String tpoNombreEstado, String tpoTipoEstado) {
		super();
		this.tpoTareaId = tpoTareaId;
		this.tpoCodigoEstado = tpoCodigoEstado;
		this.tpoNombreEstado = tpoNombreEstado;
		this.tpoTipoEstado = tpoTipoEstado;
	}

	public Integer getTpoTareaId() {
		return tpoTareaId;
	}

	public void setTpoTareaId(Integer tpoTareaId) {
		this.tpoTareaId = tpoTareaId;
	}

	public String getTpoCodigoEstado() {
		return tpoCodigoEstado;
	}

	public void setTpoCodigoEstado(String tpoCodigoEstado) {
		this.tpoCodigoEstado = tpoCodigoEstado;
	}

	public String getTpoNombreEstado() {
		return tpoNombreEstado;
	}

	public void setTpoNombreEstado(String tpoNombreEstado) {
		this.tpoNombreEstado = tpoNombreEstado;
	}

	public String getTpoTipoEstado() {
		return tpoTipoEstado;
	}

	public void setTpoTipoEstado(String tpoTipoEstado) {
		this.tpoTipoEstado = tpoTipoEstado;
	}
	
}
