package com.sensedia.apifront.model.common;

/**
 * Modelo de reposta padrão para processamento com sucesso.
 * 
 * @author Mario Mancuso
 *
 */
public class SuccessResponse {
	
	private String codigo;
	private String mensagem;
	
	
	/**
	 * Construtor.
	 * 
	 * @param codigo
	 * @param mensagem
	 */
	public SuccessResponse(String codigo, String mensagem) {
		super();
		this.codigo = codigo;
		this.mensagem = mensagem;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}
	
}
