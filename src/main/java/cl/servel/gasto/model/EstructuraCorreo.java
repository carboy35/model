package cl.servel.gasto.model;


import java.io.Serializable;
import java.util.List;


public class EstructuraCorreo implements Serializable{
	
	private List < String > to;
	
	private List < String > cc;
	
	private List < String > ccb;
	
	private String subject;
	
	private String body;
	
	private List <Attachment> attachment;

	
	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}

	public List<String> getCc() {
		return cc;
	}

	public void setCc(List<String> cc) {
		this.cc = cc;
	}

	public List<String> getCcb() {
		return ccb;
	}

	public void setCcb(List<String> ccb) {
		this.ccb = ccb;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<Attachment> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<Attachment> attachment) {
		this.attachment = attachment;
	}
}

