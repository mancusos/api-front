package com.sensedia.apifront.model.campaign;

import java.util.Date;

/**
 * Modelo que representa uma campanha.
 * 
 * @author Mario Mancuso
 *
 */
public class CampaignModel {

	private String id;
	private String title;
	private boolean status;
	private Date beginDate;
	private Date endDate;
	private String campaignModel;
	private boolean isShared;

	/**
	 * Constructor
	 */
	public CampaignModel() {
	}

	/**
	 * @param id
	 * @param title
	 * @param status
	 * @param beginDate
	 * @param endDate
	 * @param campaignModel
	 * @param isShared
	 */
	public CampaignModel(String id, String title, boolean status, Date beginDate, Date endDate, String campaignModel,
			boolean isShared) {
		super();
		this.id = id;
		this.title = title;
		this.status = status;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.campaignModel = campaignModel;
		this.isShared = isShared;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the beginDate
	 */
	public Date getBeginDate() {
		return beginDate;
	}

	/**
	 * @param beginDate
	 *            the beginDate to set
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the campaignModel
	 */
	public String getCampaignModel() {
		return campaignModel;
	}

	/**
	 * @param campaignModel
	 *            the campaignModel to set
	 */
	public void setCampaignModel(String campaignModel) {
		this.campaignModel = campaignModel;
	}

	/**
	 * @return the isShared
	 */
	public boolean isShared() {
		return isShared;
	}

	/**
	 * @param isShared
	 *            the isShared to set
	 */
	public void setShared(boolean isShared) {
		this.isShared = isShared;
	}

}
