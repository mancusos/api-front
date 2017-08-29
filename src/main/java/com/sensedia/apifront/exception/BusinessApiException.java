package com.sensedia.apifront.exception;

import org.springframework.http.HttpHeaders;

/**
 * Nível de exceção relacionado a erros de negócio.
 * 
 * @author Mario Mancuso
 *
 */
public class BusinessApiException extends Exception {

	/**
	 * Serial gerado.
	 */
	private static final long serialVersionUID = -3903047939483345867L;

	/**
	 * Código do erro.
	 */
	private String code;
	private HttpHeaders responseHeaders;

	/**
	 * @param msg
	 * @param code
	 */
	public BusinessApiException(String msg, String code) {
		super(msg);
		this.code = code;
	}

	/**
	 * @param msg
	 * @param code
	 * @param responseHeaders
	 */
	public BusinessApiException(String msg, String code, HttpHeaders responseHeaders) {
		super(msg);
		this.code = code;
		this.responseHeaders = responseHeaders;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return
	 */
	public HttpHeaders getResponseHeaders() {
		return responseHeaders;
	}

}
