package com.sensedia.apifront.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sensedia.apifront.exception.ApiException;
import com.sensedia.apifront.exception.BusinessApiException;
import com.sensedia.apifront.exception.BusinessApiException;
import com.sensedia.apifront.exception.ValidateApiExeption;
import com.sensedia.apifront.model.campaign.CampaignModel;
import com.sensedia.apifront.model.common.SuccessCreateResponse;
import com.sensedia.apifront.common.ErrorMessages;

/**
 * Expõe os recursos relacionados a campanha.
 * 
 * @author Mario Mancuso
 *
 */
@Controller
@RequestMapping(value = "/campaign/v1", produces = { APPLICATION_JSON_VALUE })
public class CampaignController extends CommonController {

	/**
	 * Log
	 */
	private Log log = LogFactory.getLog(CampaignController.class);

	/**
	 * Recurso utilizado para recuperar todas as campanhas.
	 * 
	 * @return List CampaignModel
	 * @throws Exception
	 */
	@RequestMapping(value = "/campaigns", method = RequestMethod.GET)
	public ResponseEntity<Object> getCampaigns() throws ApiException, BusinessApiException {

		List<CampaignModel> campaigns = new ArrayList<CampaignModel>();

		try {
			CampaignModel campaignModel = new CampaignModel();
			campaignModel.setId("sf7765sdfsas");
			campaignModel.setTitle("Campanha Teste");
			campaignModel.setStatus(true);
			campaignModel.setBeginDate(new Date());
			campaignModel.setEndDate(new Date());
			campaignModel.setShared(true);

			campaigns.add(campaignModel);

			/*
			 * } catch (BusinessApiException e) { log.error(
			 * "Erro de negócio ao executar o recurso getCampaigns", e); throw
			 * e;
			 */
		} catch (Exception e) {
			log.error("Erro na ao executar o recurso getCampaigns", e);
			throw new ApiException(ErrorMessages.Error.PROMO_API_ERROR_000.toString(), e.toString());
		}

		return new ResponseEntity<Object>(campaigns, HttpStatus.OK);
	}

	/**
	 * Recurso utilizado para recuperar uma determinada campanha.
	 * 
	 * @return CampaignModel
	 * @throws Exception
	 */
	@RequestMapping(value = "/campaigns/{campaignId}", method = RequestMethod.GET)
	public ResponseEntity<CampaignModel> getCampaignById(@PathVariable("campaignId") String campaignId)
			throws ApiException, BusinessApiException {

		CampaignModel campaignModel = new CampaignModel();

		try {

			campaignModel.setId("sf7765sdfsas");
			campaignModel.setTitle("Campanha Teste");
			campaignModel.setStatus(true);
			campaignModel.setBeginDate(new Date());
			campaignModel.setEndDate(new Date());
			campaignModel.setShared(true);

			/*
			 * } catch (BusinessApiException e) { log.error(
			 * "Erro de negócio ao executar o recurso getCampaignById", e);
			 * throw e;
			 */
		} catch (Exception e) {
			log.error("Erro na ao executar o recurso getCampaignById", e);
			throw new ApiException(ErrorMessages.Error.PROMO_API_ERROR_000.toString(), e.toString());
		}

		return new ResponseEntity<CampaignModel>(campaignModel, HttpStatus.OK);
	}

	/**
	 * Recurso utilizado para criar uma determinada campanha.
	 * 
	 * @return SuccessCreateResponse
	 * @throws Exception
	 */
	@RequestMapping(value = "/campaigns", method = RequestMethod.POST)
	public ResponseEntity<SuccessCreateResponse> createCampaign(@RequestBody CampaignModel campaignModel)
			throws ApiException, BusinessApiException {

		SuccessCreateResponse successCreateResponse;

		try {

			successCreateResponse = new SuccessCreateResponse(null, "asdfasdf3232");
			/*
			 * } catch (ValidateApiExeption e) { log.error(
			 * "Requisição inválida para o recurso createCampaign", e); throw e;
			 * } catch (BusinessApiException e) { log.error(
			 * "Erro de negócio ao executar o recurso createCampaign", e); throw
			 * e;
			 */
		} catch (Exception e) {
			log.error("Erro na ao executar o recurso createCampaign", e);
			throw new ApiException(ErrorMessages.Error.PROMO_API_ERROR_000.toString(), e.toString());
		}

		return new ResponseEntity<SuccessCreateResponse>(successCreateResponse, HttpStatus.CREATED);
	}

	/**
	 * Recurso utilizado para alterar uma determinada campanha.
	 * 
	 * @return SuccessCreateResponse
	 * @throws Exception
	 */
	@RequestMapping(value = "/campaigns/{campaignId}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateCampaign(@PathVariable("campaignId") String campaignId,
			@RequestBody CampaignModel campaignModel) throws ApiException, BusinessApiException {

		try {

			/*
			 * } catch (ValidateApiExeption e) { log.error(
			 * "Requisição inválida para o recurso createCampaign", e); throw e;
			 * } catch (BusinessApiException e) { log.error(
			 * "Erro de negócio ao executar o recurso createCampaign", e); throw
			 * e;
			 */
		} catch (Exception e) {
			log.error("Erro na ao executar o recurso createCampaign", e);
			throw new ApiException(ErrorMessages.Error.PROMO_API_ERROR_000.toString(), e.toString());
		}

		return new ResponseEntity<Object>(null, HttpStatus.NO_CONTENT);
	}

	/**
	 * Recurso utilizado para excluir uma determinada campanha.
	 * 
	 * @return SuccessCreateResponse
	 * @throws Exception
	 */
	@RequestMapping(value = "/campaigns/{campaignId}", method = RequestMethod.PUT)
	public ResponseEntity<Object> deleteCampaign(@PathVariable("campaignId") String campaignId)
			throws ApiException, BusinessApiException {

		try {

			/*
			 * } catch (BusinessApiException e) { log.error(
			 * "Erro de negócio ao executar o recurso createCampaign", e); throw
			 * e;
			 */
		} catch (Exception e) {
			log.error("Erro na ao executar o recurso createCampaign", e);
			throw new ApiException(ErrorMessages.Error.PROMO_API_ERROR_000.toString(), e.toString());
		}

		return new ResponseEntity<Object>(null, HttpStatus.NO_CONTENT);
	}

}
