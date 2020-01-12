package cl.servel.gasto.model;

import java.io.Serializable;
import java.util.Date;

public class InstanciaTarea implements Serializable {

	private Integer intId;
	private Integer dtaId;
	private Integer infId;
	private Integer tpoTareaId;
	private Integer usuId;
	private Integer ustId;
	private Date intFechaInicio;
	private Date intFechaTermino;
	private Date intFechaAsignacion;
	private Boolean intReasignada;
	private String intEstadoFlujo;
	private String intFolio;
	public InstanciaTarea() {
	}

	public InstanciaTarea(Integer intId, Integer dtaId, Integer infId, Integer usuId) {
		this.intId = intId; 
		this.dtaId = dtaId;
		this.infId = infId;
		this.usuId = usuId;
	}

	public InstanciaTarea(Integer intId, Integer dtaId, Integer infId, Integer tpoTareaId, Integer usuId,
			Date intFechaInicio, Date intFechaTermino, Date intFechaAsignacion, Boolean intReasignada,
			String intEstadoFlujo,String intFolio) {
		super();
		this.intId = intId;
		this.dtaId = dtaId;
		this.infId = infId;
		this.tpoTareaId = tpoTareaId;
		this.usuId = usuId;
		this.intFechaInicio = intFechaInicio;
		this.intFechaTermino = intFechaTermino;
		this.intFechaAsignacion = intFechaAsignacion;
		this.intReasignada = intReasignada;
		this.intEstadoFlujo = intEstadoFlujo;
		this.intFolio=intFolio;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public Integer getDtaId() {
		return dtaId;
	}

	public void setDtaId(Integer dtaId) {
		this.dtaId = dtaId;
	}

	public Integer getInfId() {
		return infId;
	}

	public void setInfId(Integer infId) {
		this.infId = infId;
	}

	public Integer getTpoTareaId() {
		return tpoTareaId;
	}

	public void setTpoTareaId(Integer tpoTareaId) {
		this.tpoTareaId = tpoTareaId;
	}

	public Integer getUsuId() {
		return usuId;
	}

	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}

	public Date getIntFechaInicio() {
		return intFechaInicio;
	}

	public void setIntFechaInicio(Date intFechaInicio) {
		this.intFechaInicio = intFechaInicio;
	}

	public Date getIntFechaTermino() {
		return intFechaTermino;
	}

	public void setIntFechaTermino(Date intFechaTermino) {
		this.intFechaTermino = intFechaTermino;
	}

	public Date getIntFechaAsignacion() {
		return intFechaAsignacion;
	}

	public void setIntFechaAsignacion(Date intFechaAsignacion) {
		this.intFechaAsignacion = intFechaAsignacion;
	}

	public Boolean getIntReasignada() {
		return intReasignada;
	}

	public void setIntReasignada(Boolean intReasignada) {
		this.intReasignada = intReasignada;
	}

	public String getIntEstadoFlujo() {
		return intEstadoFlujo;
	}

	public void setIntEstadoFlujo(String intEstadoFlujo) {
		this.intEstadoFlujo = intEstadoFlujo;
	}

	public Integer getUstId() {
		return ustId;
	}

	public void setUstId(Integer ustId) {
		this.ustId = ustId;
	}

	public String getIntFolio() {
		return intFolio;
	}

	public void setIntFolio(String intFolio) {
		this.intFolio = intFolio;
	}
	
}
