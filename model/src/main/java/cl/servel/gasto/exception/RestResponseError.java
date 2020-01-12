package cl.servel.gasto.exception;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

public class RestResponseError extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean response=false;
	private String message;
	private String code;
	private Object data;
	
	public RestResponseError(){
	}
	public RestResponseError(String message) {
		super();
		this.message = message;
	}

	public boolean isResponse() {
		return response;
	}
	public void setResponse(boolean response) {
		this.response = response;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
