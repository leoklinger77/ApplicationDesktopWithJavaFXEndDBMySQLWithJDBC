package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class validationException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private Map<String,String> errors = new HashMap<>();
	
	public validationException(String msg) {
		super(msg);
	}
	
	public Map<String,String> getErrors(){
		return errors;
	}
	public void addErrors(String fildName, String errorMessage) {
		errors.put(fildName, errorMessage);
	}
	

}
