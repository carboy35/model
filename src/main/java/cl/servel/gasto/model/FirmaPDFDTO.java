package cl.servel.gasto.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import cl.servel.gasto.enumerated.InformeEnum;

public class FirmaPDFDTO {
	@NotNull
	//rut sin puntos y separa el digito verificador con guion
	private String rut;
	@NotNull
	private InformeEnum informe;
	@NotNull
	//archivo en base64
	private String pdfBase64;
	@NotNull
	//Nombre del archivo con extension
	private String filename;
	@NotNull
	private String folio;
	@NotNull
	private Date fecha;
	
	public InformeEnum getInforme() {
		return informe;
	}
	public void setInforme(InformeEnum informe) {
		this.informe = informe;
	}
	public String getPdfBase64() {
		return pdfBase64;
	}
	public void setPdfBase64(String pdfBase64) {
		this.pdfBase64 = pdfBase64;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
