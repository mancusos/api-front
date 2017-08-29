package com.sensedia.apifront.exception.model;

import java.util.List;

/**
 * Modelo genérico para respostas com erro de validações.
 * 
 * @author Mario Mancuso
 *
 */
public class ValidateErrorInfo {
	
	public List<ValidationError> errosValidacao;
	public String cod;
	public String msg;
	
	/**
	 * @param errosValidacao
	 * @param cod
	 * @param msg
	 */
	public ValidateErrorInfo(List<ValidationError> errosValidacao, String cod, String msg) {
		super();
		this.errosValidacao = errosValidacao;
		this.cod = cod;
		this.msg = msg;
	}

}
