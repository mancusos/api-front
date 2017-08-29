package com.sensedia.apifront.model.common;

/**
 * Modelo de reposta padrão para POST com sucesso.
 * 
 * @author Mario Mancuso
 *
 */
public class SuccessCreateResponse {

	private String mensagem;
	private String id;

	/**
	 * Construtor.
	 * 
	 * @param codigo
	 * @param mensagem
	 * @param id
	 */
	public SuccessCreateResponse(String mensagem, String id) {
		super();
		this.mensagem = mensagem;
		this.id = id;
	}

	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

}
