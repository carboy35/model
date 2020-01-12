package cl.servel.gasto.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetalleCreacionTarea implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idDefinicionFlujo;
	private List<Integer> grupos;
	private Map<Integer, Integer> partidosLineas;
	private Map<Integer, Integer> candidatosLineas;
	private int eveId;
	private List<CelulaRevisor> revisores;

	public DetalleCreacionTarea() {
		super();

		 partidosLineas = new HashMap<Integer, Integer>();
		 candidatosLineas = new HashMap<Integer, Integer>();
	}

	public int getIdDefinicionFlujo() {
		return idDefinicionFlujo;
	}

	public void setIdDefinicionFlujo(int idDefinicionFlujo) {
		this.idDefinicionFlujo = idDefinicionFlujo;
	}

	public List<Integer> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Integer> grupos) {
		this.grupos = grupos;
	}

	public Map<Integer, Integer> getPartidosLineas() {
		return partidosLineas;
	}

	public void setPartidosLineas(Map<Integer, Integer> partidosLineas) {
		this.partidosLineas = partidosLineas;
	}

	public Map<Integer, Integer> getCandidatosLineas() {
		return candidatosLineas;
	}

	public void setCandidatosLineas(Map<Integer, Integer> candidatosLineas) {
		this.candidatosLineas = candidatosLineas;
	}

	public int getEveId() {
		return eveId;
	}

	public void setEveId(int eveId) {
		this.eveId = eveId;
	}

	public List<CelulaRevisor> getRevisores() {
		return revisores;
	}

	public void setRevisores(List<CelulaRevisor> revisores) {
		this.revisores = revisores;
	}

	
}
