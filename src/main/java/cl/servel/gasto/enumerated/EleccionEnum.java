package cl.servel.gasto.enumerated;

public enum EleccionEnum {
	ALCALDE("1"),
	CONCEJAL("2"),
	GOBERNADOR("3"),
	PRESIDENTE("4"),
	SENADOR("5"),
	DIPUTADO("6"),
	CONSEJERO_REGIONAL("7");
	
	public final String codigo;
	
	public String getCodigo() {
		return codigo;
	}
//
//	public void setCodigo(String codigo) {
//		this.codigo = codigo;
//	}

	private EleccionEnum(String codigo) {
		this.codigo=codigo;
	}
	  public static final EleccionEnum valueOfIgnoreCase(String codigo) {
		  codigo = codigo.toUpperCase();
	        return valueOf(codigo);
	    }
	

}
