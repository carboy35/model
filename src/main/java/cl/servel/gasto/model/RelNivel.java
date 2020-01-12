package cl.servel.gasto.model;

public class RelNivel implements java.io.Serializable {

	private Integer rlcId;
	private Integer idEveEventoEleccionario;
	private Integer nivNivelByNivIdPadre;
	private Integer nivNivelByNivIdHijo;
	private String  tpoNivelByTpoNivCodigoHijo;
	private String 	tpoNivelByTpoNivCodigoPadre;
	private Integer rlcOrdenPresedencia;
	
	public Integer getRlcId() {
		return rlcId;
	}
	public void setRlcId(Integer rlcId) {
		this.rlcId = rlcId;
	}
	public Integer getIdEveEventoEleccionario() {
		return idEveEventoEleccionario;
	}
	public void setIdEveEventoEleccionario(Integer idEveEventoEleccionario) {
		this.idEveEventoEleccionario = idEveEventoEleccionario;
	}
	public Integer getNivNivelByNivIdPadre() {
		return nivNivelByNivIdPadre;
	}
	public void setNivNivelByNivIdPadre(Integer nivNivelByNivIdPadre) {
		this.nivNivelByNivIdPadre = nivNivelByNivIdPadre;
	}
	public Integer getNivNivelByNivIdHijo() {
		return nivNivelByNivIdHijo;
	}
	public void setNivNivelByNivIdHijo(Integer nivNivelByNivIdHijo) {
		this.nivNivelByNivIdHijo = nivNivelByNivIdHijo;
	}
	public String getTpoNivelByTpoNivCodigoHijo() {
		return tpoNivelByTpoNivCodigoHijo;
	}
	public void setTpoNivelByTpoNivCodigoHijo(String tpoNivelByTpoNivCodigoHijo) {
		this.tpoNivelByTpoNivCodigoHijo = tpoNivelByTpoNivCodigoHijo;
	}
	public String getTpoNivelByTpoNivCodigoPadre() {
		return tpoNivelByTpoNivCodigoPadre;
	}
	public void setTpoNivelByTpoNivCodigoPadre(String tpoNivelByTpoNivCodigoPadre) {
		this.tpoNivelByTpoNivCodigoPadre = tpoNivelByTpoNivCodigoPadre;
	}
	public Integer getRlcOrdenPresedencia() {
		return rlcOrdenPresedencia;
	}
	public void setRlcOrdenPresedencia(Integer rlcOrdenPresedencia) {
		this.rlcOrdenPresedencia = rlcOrdenPresedencia;
	}

	
}
