package cl.servel.gasto.model;

public class RelTarea {

	private Integer rlcId;
	private Integer dtaDefinicionTareaByRlcIdAnteriorId;
	private Integer dtaDefinicionTareaByRlcIdSiguienteId;
	private Integer idDtaDefinicionTareaByDtaId;
	private String condicion;
	private Boolean rutaActiva;

	
	public RelTarea() {
	}

	public RelTarea(Integer rlcId, Integer dtaDefinicionTareaByRlcIdAnteriorId,
			Integer dtaDefinicionTareaByRlcIdSiguienteId, Integer idDtaDefinicionTareaByDtaId, String condicion,
			Boolean rutaActiva) {
		super();
		this.rlcId = rlcId;
		this.dtaDefinicionTareaByRlcIdAnteriorId = dtaDefinicionTareaByRlcIdAnteriorId;
		this.dtaDefinicionTareaByRlcIdSiguienteId = dtaDefinicionTareaByRlcIdSiguienteId;
		this.idDtaDefinicionTareaByDtaId = idDtaDefinicionTareaByDtaId;
		this.condicion = condicion;
		this.rutaActiva = rutaActiva;
	}

	public Integer getRlcId() {
		return rlcId;
	}

	public void setRlcId(Integer rlcId) {
		this.rlcId = rlcId;
	}

	public Integer getDtaDefinicionTareaByRlcIdAnteriorId() {
		return dtaDefinicionTareaByRlcIdAnteriorId;
	}

	public void setDtaDefinicionTareaByRlcIdAnteriorId(Integer dtaDefinicionTareaByRlcIdAnteriorId) {
		this.dtaDefinicionTareaByRlcIdAnteriorId = dtaDefinicionTareaByRlcIdAnteriorId;
	}

	public Integer getDtaDefinicionTareaByRlcIdSiguienteId() {
		return dtaDefinicionTareaByRlcIdSiguienteId;
	}

	public void setDtaDefinicionTareaByRlcIdSiguienteId(Integer dtaDefinicionTareaByRlcIdSiguienteId) {
		this.dtaDefinicionTareaByRlcIdSiguienteId = dtaDefinicionTareaByRlcIdSiguienteId;
	}

	public Integer getIdDtaDefinicionTareaByDtaId() {
		return idDtaDefinicionTareaByDtaId;
	}

	public void setIdDtaDefinicionTareaByDtaId(Integer idDtaDefinicionTareaByDtaId) {
		this.idDtaDefinicionTareaByDtaId = idDtaDefinicionTareaByDtaId;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	public Boolean getRutaActiva() {
		return rutaActiva;
	}

	public void setRutaActiva(Boolean rutaActiva) {
		this.rutaActiva = rutaActiva;
	}

	@Override
	public String toString() {
		return "RelTarea [rlcId=" + rlcId + ", dtaDefinicionTareaByRlcIdAnteriorId="
				+ dtaDefinicionTareaByRlcIdAnteriorId + ", dtaDefinicionTareaByRlcIdSiguienteId="
				+ dtaDefinicionTareaByRlcIdSiguienteId + ", idDtaDefinicionTareaByDtaId=" + idDtaDefinicionTareaByDtaId
				+ ", condicion=" + condicion + ", rutaActiva=" + rutaActiva + "]";
	}
	
}
