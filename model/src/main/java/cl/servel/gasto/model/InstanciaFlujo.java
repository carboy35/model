package cl.servel.gasto.model;

import java.io.Serializable;
import java.util.Date;

public class InstanciaFlujo implements Serializable {

	private Integer infId;
	private Integer canId;
	private Integer dtaId;
	private Integer eveId;
	private Integer parId;
	private Integer usuId;
	private Date infFechaInicio;
	private Date infFechaTermino;
	private String infEstadoFlujo;
	private Boolean infConObservacion;
	private Boolean infConRespuesta;
	private Date infFechaAsignacion;
	private Integer infTotalLineas;
	private Integer usuarioSubrogado;
	private Integer inbId;

	public InstanciaFlujo() {
	}

	public InstanciaFlujo(Integer eveId, Integer usuId) {
		this.eveId = eveId;
		this.usuId = usuId;
	}
	
	

	public InstanciaFlujo(Integer infId, Integer canId, Integer dtaId, Integer eveId, Integer parId, Integer usuId,
			Date infFechaInicio, Date infFechaTermino, String infEstadoFlujo, Boolean infConObservacion,
			Boolean infConRespuesta, Date infFechaAsignacion, Integer infTotalLineas, Integer usuarioSubrogado,
			Integer inbId) {
		super();
		this.infId = infId;
		this.canId = canId;
		this.dtaId = dtaId;
		this.eveId = eveId;
		this.parId = parId;
		this.usuId = usuId;
		this.infFechaInicio = infFechaInicio;
		this.infFechaTermino = infFechaTermino;
		this.infEstadoFlujo = infEstadoFlujo;
		this.infConObservacion = infConObservacion;
		this.infConRespuesta = infConRespuesta;
		this.infFechaAsignacion = infFechaAsignacion;
		this.infTotalLineas = infTotalLineas;
		this.usuarioSubrogado = usuarioSubrogado;
		this.inbId = inbId;
	}

	public Integer getInfId() {
		return infId;
	}

	public void setInfId(Integer infId) {
		this.infId = infId;
	}

	public Integer getCanId() {
		return canId;
	}

	public void setCanId(Integer canId) {
		this.canId = canId;
	}

	public Integer getDtaId() {
		return dtaId;
	}

	public void setDtaId(Integer dtaId) {
		this.dtaId = dtaId;
	}

	public Integer getEveId() {
		return eveId;
	}

	public void setEveId(Integer eveId) {
		this.eveId = eveId;
	}

	public Integer getParId() {
		return parId;
	}

	public void setParId(Integer parId) {
		this.parId = parId;
	}

	public Integer getUsuId() {
		return usuId;
	}

	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}

	public Date getInfFechaInicio() {
		return infFechaInicio;
	}

	public void setInfFechaInicio(Date infFechaInicio) {
		this.infFechaInicio = infFechaInicio;
	}

	public Date getInfFechaTermino() {
		return infFechaTermino;
	}

	public void setInfFechaTermino(Date infFechaTermino) {
		this.infFechaTermino = infFechaTermino;
	}

	public String getInfEstadoFlujo() {
		return infEstadoFlujo;
	}

	public void setInfEstadoFlujo(String infEstadoFlujo) {
		this.infEstadoFlujo = infEstadoFlujo;
	}

	public Boolean getInfConObservacion() {
		return infConObservacion;
	}

	public void setInfConObservacion(Boolean infConObservacion) {
		this.infConObservacion = infConObservacion;
	}

	public Boolean getInfConRespuesta() {
		return infConRespuesta;
	}

	public void setInfConRespuesta(Boolean infConRespuesta) {
		this.infConRespuesta = infConRespuesta;
	}

	public Date getInfFechaAsignacion() {
		return infFechaAsignacion;
	}

	public void setInfFechaAsignacion(Date infFechaAsignacion) {
		this.infFechaAsignacion = infFechaAsignacion;
	}

	public Integer getInfTotalLineas() {
		return infTotalLineas;
	}

	public void setInfTotalLineas(Integer infTotalLineas) {
		this.infTotalLineas = infTotalLineas;
	}

	public Integer getUsuarioSubrogado() {
		return usuarioSubrogado;
	}

	public void setUsuarioSubrogado(Integer usuarioSubrogado) {
		this.usuarioSubrogado = usuarioSubrogado;
	}

	public Integer getInbId() {
		return inbId;
	}

	public void setInbId(Integer inbId) {
		this.inbId = inbId;
	}
	
}