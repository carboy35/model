package cl.servel.gasto.enumerated;

public enum TipoRecursoEnum {
	RECLAMACION("RECLAMACION"), 
	REPOSICION("REPOSICION"),
	SUBSIDIO_RECLAMACION("SUBSIDIO_RECLAMACION");
	
	private String tipoRecurso;

	private TipoRecursoEnum(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}

	public String getTipoRecurso() {
		return tipoRecurso;
	}

	public void setTipoRecurso(String tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}
}
