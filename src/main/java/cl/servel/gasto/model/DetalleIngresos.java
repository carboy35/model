package cl.servel.gasto.model;


public class DetalleIngresos {
	private Integer dinId;
	private int ingId;
	private String dinNombreAtributo;
	private String dinValorAtributo;
	public DetalleIngresos() {
		
	}
	public Integer getDinId() {
		return dinId;
	}
	public void setDinId(Integer dinId) {
		this.dinId = dinId;
	}
	public int getIngId() {
		return ingId;
	}
	public void setIngId(int ingId) {
		this.ingId = ingId;
	}
	
	public String getDinNombreAtributo() {
		return dinNombreAtributo;
	}
	public void setDinNombreAtributo(String dinNombreAtributo) {
		this.dinNombreAtributo = dinNombreAtributo;
	}
	public String getDinValorAtributo() {
		return dinValorAtributo;
	}
	public void setDinValorAtributo(String dinValorAtributo) {
		this.dinValorAtributo = dinValorAtributo;
	}
}
