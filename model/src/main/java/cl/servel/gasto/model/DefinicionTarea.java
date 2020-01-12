package cl.servel.gasto.model;

import java.io.Serializable;

public class DefinicionTarea implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer dtaId;
	private Integer dbnId;
	private int dflId;
	private Integer tpoTareaId;
	private String dtaCodigoOrigen;
	private String dtaNombreTarea;
	private Integer dtaSlaTarea;
	private boolean dtaUsuarioRepetido;
	private boolean dtaRutaDinamica;
	private boolean dtaPermiteSubrogante;
	private int total;
	private boolean dtaUsuarioTransversal;

	public DefinicionTarea() {
		super();
	}

	public DefinicionTarea(int dtaId, Integer dbnId, int dflId, Integer tpoTareaId, String dtaCodigoOrigen, String dtaNombreTarea, Integer dtaSlaTarea, boolean dtaUsuarioRepetido, boolean dtaRutaDinamica, boolean dtaPermiteSubrogante, boolean dtaUsuarioTransversal) {
		super();
		this.dtaId = dtaId;
		this.dbnId = dbnId;
		this.dflId = dflId;
		this.tpoTareaId = tpoTareaId;
		this.dtaCodigoOrigen = dtaCodigoOrigen;
		this.dtaNombreTarea = dtaNombreTarea;
		this.dtaSlaTarea = dtaSlaTarea;
		this.dtaUsuarioRepetido = dtaUsuarioRepetido;
		this.dtaRutaDinamica = dtaRutaDinamica;
		this.dtaPermiteSubrogante = dtaPermiteSubrogante;
		this.dtaUsuarioTransversal = dtaUsuarioTransversal;
	}

	public Integer getDtaId() {
		return dtaId;
	}

	public void setDtaId(Integer dtaId) {
		this.dtaId = dtaId;
	}

	public Integer getDbnId() {
		return dbnId;
	}

	public void setDbnId(Integer dbnId) {
		this.dbnId = dbnId;
	}

	public int getDflId() {
		return dflId;
	}

	public void setDflId(int dflId) {
		this.dflId = dflId;
	}

	public Integer getTpoTareaId() {
		return tpoTareaId;
	}

	public void setTpoTareaId(Integer tpoTareaId) {
		this.tpoTareaId = tpoTareaId;
	}

	public String getDtaCodigoOrigen() {
		return dtaCodigoOrigen;
	}

	public void setDtaCodigoOrigen(String dtaCodigoOrigen) {
		this.dtaCodigoOrigen = dtaCodigoOrigen;
	}

	public String getDtaNombreTarea() {
		return dtaNombreTarea;
	}

	public void setDtaNombreTarea(String dtaNombreTarea) {
		this.dtaNombreTarea = dtaNombreTarea;
	}

	public Integer getDtaSlaTarea() {
		return dtaSlaTarea;
	}

	public void setDtaSlaTarea(Integer dtaSlaTarea) {
		this.dtaSlaTarea = dtaSlaTarea;
	}

	public boolean isDtaUsuarioRepetido() {
		return dtaUsuarioRepetido;
	}

	public void setDtaUsuarioRepetido(boolean dtaUsuarioRepetido) {
		this.dtaUsuarioRepetido = dtaUsuarioRepetido;
	}

	public boolean isDtaRutaDinamica() {
		return dtaRutaDinamica;
	}

	public void setDtaRutaDinamica(boolean dtaRutaDinamica) {
		this.dtaRutaDinamica = dtaRutaDinamica;
	}

	public boolean isDtaPermiteSubrogante() {
		return dtaPermiteSubrogante;
	}

	public void setDtaPermiteSubrogante(boolean dtaPermiteSubrogante) {
		this.dtaPermiteSubrogante = dtaPermiteSubrogante;
	}
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isDtaUsuarioTransversal() {
		return dtaUsuarioTransversal;
	}

	public void setDtaUsuarioTransversal(boolean dtaUsuarioTransversal) {
		this.dtaUsuarioTransversal = dtaUsuarioTransversal;
	}
	

}
