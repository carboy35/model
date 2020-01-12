package cl.servel.gasto.model;

public class CambioLineaDetalleDTO {
	private String formulario;
	private Integer hoja;
	private Integer linea;
	private String concepto;
	private String detalleInicial;
	private String detalleFinal;
	public String getFormulario() {
		return formulario;
	}
	public void setFormulario(String formulario) {
		this.formulario = formulario;
	}
	public Integer getHoja() {
		return hoja;
	}
	public void setHoja(Integer hoja) {
		this.hoja = hoja;
	}
	public Integer getLinea() {
		return linea;
	}
	public void setLinea(Integer linea) {
		this.linea = linea;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getDetalleInicial() {
		return detalleInicial;
	}
	public void setDetalleInicial(String detalleInicial) {
		this.detalleInicial = detalleInicial;
	}
	public String getDetalleFinal() {
		return detalleFinal;
	}
	public void setDetalleFinal(String detalleFinal) {
		this.detalleFinal = detalleFinal;
	}
	
}
