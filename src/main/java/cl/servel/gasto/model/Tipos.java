package cl.servel.gasto.model;

public class Tipos {
	private Integer tpoId;
	private String tpoCodigo;
	private String tpoDescripcion;
	private String tpoCodAgrupacion;
	private String moneda;
	
	public Integer getTpoId() {
		return tpoId;
	}
	public void setTpoId(Integer tpoId) {
		this.tpoId = tpoId;
	}
	public String getTpoCodigo() {
		return tpoCodigo;
	}
	public void setTpoCodigo(String tpoCodigo) {
		this.tpoCodigo = tpoCodigo;
	}
	public String getTpoDescripcion() {
		return tpoDescripcion;
	}
	public void setTpoDescripcion(String tpoDescripcion) {
		this.tpoDescripcion = tpoDescripcion;
	}
	public String getTpoCodAgrupacion() {
		return tpoCodAgrupacion;
	}
	public void setTpoCodAgrupacion(String tpoCodAgrupacion) {
		this.tpoCodAgrupacion = tpoCodAgrupacion;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
}
