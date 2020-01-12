package cl.servel.gasto.model;

public class TipoEvento implements java.io.Serializable {

	private Integer tpoEventoId;
	private String tpoEventoNombre;
	private String tpoCodigoOrigen;
	private Integer tpoEventoOrden;
	
	public String getTpoCodigoOrigen() {
		return tpoCodigoOrigen;
	}
	public void setTpoCodigoOrigen(String tpoCodigoOrigen) {
		this.tpoCodigoOrigen = tpoCodigoOrigen;
	}
	public Integer getTpoEventoId() {
		return tpoEventoId;
	}
	public void setTpoEventoId(Integer tpoEventoId) {
		this.tpoEventoId = tpoEventoId;
	}
	public String getTpoEventoNombre() {
		return tpoEventoNombre;
	}
	public void setTpoEventoNombre(String tpoEventoNombre) {
		this.tpoEventoNombre = tpoEventoNombre;
	}
	public Integer getTpoEventoOrden() {
		return tpoEventoOrden;
	}
	public void setTpoEventoOrden(Integer tpoEventoOrden) {
		this.tpoEventoOrden = tpoEventoOrden;
	}
	
	

}
