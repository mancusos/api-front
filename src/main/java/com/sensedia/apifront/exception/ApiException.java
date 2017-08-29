package com.sensedia.apifront.exception;

/**
 * Representa o maior nível de exceção possível de tratamento dentro da API.
 * 
 * @author Mario Mancuso
 *
 */
public class ApiException extends Exception {

	/**
	 * Serial gerado.
	 */
	private static final long serialVersionUID = 8630022199221210136L;

	/**
	 * Código do erro.
	 */
	private String code;

	/*
	 * @see Exception
	 */
	public ApiException(String msg, Throwable cause) {
		super(msg, cause);
	}

	/*
	 * @see Exception
	 */
	public ApiException(String msg) {
		super(msg);
	}

	/**
	 * @param code
	 *            - código do erro
	 * @param msg
	 *            - mensagem do erro.
	 */
	public ApiException(String code, String msg) {
		super(msg);
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
