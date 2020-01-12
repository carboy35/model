package cl.servel.gasto.model;

public class UsuarioTarea {
	private Integer ustId;
	private Integer gutGrupoUsuarioTareaId;
	private Integer usuUsuariosId;
	private boolean ustActivo;
	private Integer usuUsuarioSubrogante;
	
	public UsuarioTarea() {
	}
	
	public UsuarioTarea(Integer ustId, Integer gutGrupoUsuarioTareaId, Integer usuUsuariosId, boolean ustActivo,
			Integer usuUsuarioSubrogante) {
		super();
		this.ustId = ustId;
		this.gutGrupoUsuarioTareaId = gutGrupoUsuarioTareaId;
		this.usuUsuariosId = usuUsuariosId;
		this.ustActivo = ustActivo;
		this.usuUsuarioSubrogante = usuUsuarioSubrogante;
	}

	public Integer getUstId() {
		return ustId;
	}

	public void setUstId(Integer ustId) {
		this.ustId = ustId;
	}

	public Integer getGutGrupoUsuarioTareaId() {
		return gutGrupoUsuarioTareaId;
	}

	public void setGutGrupoUsuarioTareaId(Integer gutGrupoUsuarioTareaId) {
		this.gutGrupoUsuarioTareaId = gutGrupoUsuarioTareaId;
	}

	public Integer getUsuUsuariosId() {
		return usuUsuariosId;
	}

	public void setUsuUsuariosId(Integer usuUsuariosId) {
		this.usuUsuariosId = usuUsuariosId;
	}

	public boolean isUstActivo() {
		return ustActivo;
	}

	public void setUstActivo(boolean ustActivo) {
		this.ustActivo = ustActivo;
	}

	public Integer getUsuUsuarioSubrogante() {
		return usuUsuarioSubrogante;
	}

	public void setUsuUsuarioSubrogante(Integer usuUsuarioSubrogante) {
		this.usuUsuarioSubrogante = usuUsuarioSubrogante;
	}
}
