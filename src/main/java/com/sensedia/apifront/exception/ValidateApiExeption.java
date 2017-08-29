package com.sensedia.apifront.exception;

import java.util.List;

import com.sensedia.apifront.exception.model.ValidationError;

/**
 * Nível de exceção relacionado a validações da API.
 * 
 * @author Mario Mancuso
 *
 */
public class ValidateApiExeption extends Exception {

	/**
	 * Serial gerado.
	 */
	private static final long serialVersionUID = 612743078724382392L;
	
	
	/**
	 * Código do erro. 
	 */
	private String code;
	
	
	/**
	 * Lista de parâmetros. 
	 */
	private List<ValidationError> params;
	
	/**
	 * @param code
	 * @param msg
	 * @param validationErrors
	 */
	public ValidateApiExeption(String code, String msg, List<ValidationError> validationErrors) {
		super(msg);
		this.code = code;
		this.params = validationErrors;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the params
	 */
	public List<ValidationError> getParams() {
		return params;
	}

}
