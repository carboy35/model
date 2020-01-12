package cl.servel.gasto.respuesta;

public class RestResponse {
	public RestResponse() {
	}
	public RestResponse(boolean response, String id) {
		this.response = response;
		this.id = id;
	}
	boolean response;
	String id;
	
	public boolean getResponse() {
		return response;
	}
	public void setResponse(boolean response) {
		this.response = response;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	

}
