package cl.servel.gasto.exception;

public class CustomErrorType {

	 private String message;
	 private int statusCode;
	 
	 
	    public CustomErrorType(String message,int code){
	        this.message = message;
	        this.statusCode = code;
	    }
	 
	    public int getStatusCode() {
	        return statusCode;
	    }
	    
	    public String getMessage() {
	        return message;
	    }
	    
}
