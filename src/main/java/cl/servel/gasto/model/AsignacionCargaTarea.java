package cl.servel.gasto.model;

import java.io.Serializable;

public class AsignacionCargaTarea implements Serializable {

	private Integer asgId;
	private Integer dtaId;
	private Integer gutId;
	private Integer tpoEleccionId;
	private Long asgCantidadLineas;
	private Long asgIdAsignacionDeGrupo;
	private Boolean asgAltaComplejidad;

	public AsignacionCargaTarea() {
	}

	public AsignacionCargaTarea(Integer asgId, Integer dtaId, Integer gutId, Integer tpoEleccionId,
			Long asgCantidadLineas, Long asgIdAsignacionDeGrupo, Boolean asgAltaComplejidad) {
		this.asgId = asgId;
		this.dtaId = dtaId;
		this.gutId = gutId;
		this.tpoEleccionId = tpoEleccionId;
		this.asgCantidadLineas = asgCantidadLineas;
		this.asgIdAsignacionDeGrupo = asgIdAsignacionDeGrupo;
		this.asgAltaComplejidad = asgAltaComplejidad;
	}

	public Integer getAsgId() {
		return asgId;
	}

	public void setAsgId(Integer asgId) {
		this.asgId = asgId;
	}

	public Integer getDtaId() {
		return dtaId;
	}

	public void setDtaId(Integer dtaId) {
		this.dtaId = dtaId;
	}

	public Integer getGutId() {
		return gutId;
	}

	public void setGutId(Integer gutId) {
		this.gutId = gutId;
	}

	public Integer getTpoEleccionId() {
		return tpoEleccionId;
	}

	public void setTpoEleccionId(Integer tpoEleccionId) {
		this.tpoEleccionId = tpoEleccionId;
	}

	public Long getAsgCantidadLineas() {
		return asgCantidadLineas;
	}

	public void setAsgCantidadLineas(Long asgCantidadLineas) {
		this.asgCantidadLineas = asgCantidadLineas;
	}

	public Long getAsgIdAsignacionDeGrupo() {
		return asgIdAsignacionDeGrupo;
	}

	public void setAsgIdAsignacionDeGrupo(Long asgIdAsignacionDeGrupo) {
		this.asgIdAsignacionDeGrupo = asgIdAsignacionDeGrupo;
	}

	public Boolean getAsgAltaComplejidad() {
		return asgAltaComplejidad;
	}

	public void setAsgAltaComplejidad(Boolean asgAltaComplejidad) {
		this.asgAltaComplejidad = asgAltaComplejidad;
	}
}