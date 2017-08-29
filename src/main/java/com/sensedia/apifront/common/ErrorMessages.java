package com.sensedia.apifront.common;

/**
 * Mapeamento dos possíveis erros e suas respectivas mensagens.
 *
 * @author Mario Mancuso
 *
 */
public class ErrorMessages {

	/**
	 * 
	 * Enum com os possiveis erros.
	 *
	 */
	public enum Error {
		
		PROMO_API_ERROR_000("Erro não esperado ao executar o recurso"),
		PROMO_API_ERROR_001("Nao foi possivel processar as instrucoes contidas na requisicao");

		private String message;

		/**
		 * Construtor.
		 * 
		 * @param message
		 */
		private Error(String message) {
			this.message = message;
		}

		/**
		 * @return the message
		 */
		public String getMsg() {
			return message;
		}
		
	}
	
	/**
	 * 
	 * Enum com as possiveis restrições encontradas em campos de entrada.
	 *
	 */
	public enum RestrictionType {
		
		REQUIRED("Campo obrigatório"),
		UNIQUE("Campo deve ser único"),
		INVALID("Campo inválido");
		
		private String restriction;
		
		/**
		 * Construtor.
		 * 
		 * @param restriction
		 */
		private RestrictionType(String restriction) {
			this.restriction = restriction;
		}

		/**
		 * @return the restriction
		 */
		public String getRestriction() {
			return restriction;
		}
		
	}

}
