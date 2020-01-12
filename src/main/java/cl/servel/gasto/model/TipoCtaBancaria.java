package cl.servel.gasto.model;

public class TipoCtaBancaria implements java.io.Serializable {

 private static final long serialVersionUID = 1L;	
 private Integer tpoCtaBancariaId;
 private String  tpoNombreCuenta;

 public Integer getTpoCtaBancariaId() {
		return tpoCtaBancariaId;
	}
 public void setTpoCtaBancariaId(Integer tpoCtaBancariaId) {
		this.tpoCtaBancariaId = tpoCtaBancariaId;
	}

	 
 public String getTpoNombreCuenta() {
		return tpoNombreCuenta;
	}
 public void setTpoNombreCuenta(String tpoNombreCuenta) {
		this.tpoNombreCuenta = tpoNombreCuenta;
	}
 
}
