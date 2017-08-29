package com.sensedia.apifront.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sensedia.apifront.exception.ApiException;
import com.sensedia.apifront.exception.BusinessApiException;
import com.sensedia.apifront.exception.ValidateApiExeption;
import com.sensedia.apifront.exception.model.ErrorInfo;
import com.sensedia.apifront.exception.model.ValidateErrorInfo;
import com.sensedia.apifront.common.ErrorMessages;

/**
 * Classe de controle para compartilhamento de recursos comuns.
 * 
 * @author Mario Mancuso
 *
 */
@Controller
public class CommonController {

	/**
	 * Resposta padrão para erros de validações.
	 * 
	 * @param e
	 * @return
	 */
	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	@ExceptionHandler(ValidateApiExeption.class)
	@ResponseBody
	ValidateErrorInfo handleValidateRequest(ValidateApiExeption e) {
		return new ValidateErrorInfo(e.getParams(), e.getCode(), e.getMessage());
	}

	/**
	 * Resposta padrão para erros de negócio.
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(BusinessApiException.class)
	@ResponseBody
	ResponseEntity<ErrorInfo> handleBusinessError(BusinessApiException e) {

		if (e.getResponseHeaders() != null) {
			return new ResponseEntity<ErrorInfo>(new ErrorInfo(e.getCode(), e.getMessage()), e.getResponseHeaders(),
					HttpStatus.UNPROCESSABLE_ENTITY);
		}

		return new ResponseEntity<ErrorInfo>(new ErrorInfo(e.getCode(), e.getMessage()),
				HttpStatus.UNPROCESSABLE_ENTITY);
	}

	/**
	 * Resposta padrão para erros inesperados.
	 * 
	 * @return
	 */
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(ApiException.class)
	@ResponseBody
	ErrorInfo handleInternalError() {
		return new ErrorInfo(ErrorMessages.Error.PROMO_API_ERROR_000.toString(),
				ErrorMessages.Error.PROMO_API_ERROR_000.getMsg());
	}

}
