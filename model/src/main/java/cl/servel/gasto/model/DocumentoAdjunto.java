package cl.servel.gasto.model;
// Generated 02-01-2019 19:29:27 by Hibernate Tools 5.2.11.Final

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DocumentoAdjunto implements Serializable {

	private Integer docId;
	private Integer rendicionId;
	private String docNombreDocumento;
	private String docIdRepositorioDocumental;
	private String docTipoDocumento;
	private Date docCreated;
	
	
	
	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public Integer getRendicionId() {
		return rendicionId;
	}
	public void setRendicionId(Integer rendicionId) {
		this.rendicionId = rendicionId;
	}
	public String getDocNombreDocumento() {
		return docNombreDocumento;
	}
	public void setDocNombreDocumento(String docNombreDocumento) {
		this.docNombreDocumento = docNombreDocumento;
	}
	public String getDocIdRepositorioDocumental() {
		return docIdRepositorioDocumental;
	}
	public void setDocIdRepositorioDocumental(String docIdRepositorioDocumental) {
		this.docIdRepositorioDocumental = docIdRepositorioDocumental;
	}
	public String getDocTipoDocumento() {
		return docTipoDocumento;
	}
	public void setDocTipoDocumento(String docTipoDocumento) {
		this.docTipoDocumento = docTipoDocumento;
	}
	public Date getDocCreated() {
		return docCreated;
	}
	public void setDocCreated(Date docCreated) {
		this.docCreated = docCreated;
	}
	
	
	
}
