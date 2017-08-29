package com.sensedia.apifront.exception.model;

/**
 * Modelo genérico para respostas com erro.
 * 
 * @author Mario Mancuso
 *
 */
public class ErrorInfo {
	
	public String cod;
	public String msg;
	
	/**
	 * Construtor.
	 * @param cod
	 * @param msg
	 */
	public ErrorInfo(String cod, String msg) {
		super();
		this.cod = cod;
		this.msg = msg;
	}

}
