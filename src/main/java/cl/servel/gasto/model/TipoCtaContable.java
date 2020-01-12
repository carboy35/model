package cl.servel.gasto.model;

public class TipoCtaContable implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer tpoCtaContableId;
	private String tpoNombreCuenta;
	 
	public Integer getTpoCtaContableId() {
		return tpoCtaContableId;
	}
	public void setTpoCtaContableId(Integer tpoCtaContableId) {
		this.tpoCtaContableId = tpoCtaContableId;
	}
	  
	public String getTpoNombreCuenta() {
		return tpoNombreCuenta;
	}
	public void setTpoNombreCuenta(String tpoNombreCuenta) {
		this.tpoNombreCuenta = tpoNombreCuenta;
	}

}
