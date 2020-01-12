package cl.servel.gasto.enumerated;

public enum PerfilEnum {
	SUPERADMIN("SUPERADMIN", "SÚPER ADMINISTRADOR","admin"), 
	ADMIN("ADMIN", "ADMINISTRADOR","admin_servel"), 
	AUDITORJR("AUDITORJR", "AUDITOR JUNIOR","auditorjr"), 
	AUDITORSR("AUDITORSR", "AUDITOR SENIOR","auditorsr"), 
	ABOGADO("ABOGADO", "ABOGADO","abogado"), 
	JEFEUNIDAD("JEFEUNIDAD", "JEFE DE UNIDAD","jefe_unidad"), 
	JEFEDIVISION("JEFEDIVISION", "JEFE DE DIVISIÓN","jefe_division"), 
	SUBDIRECTOR("SUBDIRECTOR", "SUB DIRECTOR","subdirector"),
	DIRECTOR("DIRECTOR", "Director","director");

	private String codigo;
	private String descripcion;
	private String codigoPerfil;
	
	private PerfilEnum(String codigo, String descripcion,String codigoPerfil) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.codigoPerfil=codigoPerfil;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigoPerfil() {
		return codigoPerfil;
	}

	public void setCodigoPerfil(String codigoPerfil) {
		this.codigoPerfil = codigoPerfil;
	}
	
}
