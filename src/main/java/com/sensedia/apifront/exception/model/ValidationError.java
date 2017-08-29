package com.sensedia.apifront.exception.model;

/**
 * Modelo genérico para compor erros de validações de campos de entrada.
 * 
 * @author Mario Mancuso
 *
 */
public class ValidationError {

	private String campo;
	private String tipoRestricao;
	private String msg;

	/**
	 * @param campo
	 * @param tipoRestricao
	 * @param msg
	 */
	public ValidationError(String campo, String tipoRestricao, String msg) {
		super();
		this.campo = campo;
		this.tipoRestricao = tipoRestricao;
		this.msg = msg;
	}

	/**
	 * @return the campo
	 */
	public String getCampo() {
		return campo;
	}

	/**
	 * @return the tipoRestricao
	 */
	public String getTipoRestricao() {
		return tipoRestricao;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

}
