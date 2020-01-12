package cl.servel.gasto.enumerated;

public enum CandidatoPartidoEnum{
	CANDIDATO("Candidato", "CAN_"),
	PARTIDO("Partido", "PAR_");
	private String nombre;
	private String prefijoParametro;

	private CandidatoPartidoEnum(String nombre, String prefijoParametro) {
		this.nombre = nombre;
		this.prefijoParametro = prefijoParametro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrefijoParametro() {
		return prefijoParametro;
	}

	public void setPrefijoParametro(String prefijoParametro) {
		this.prefijoParametro = prefijoParametro;
	}
}