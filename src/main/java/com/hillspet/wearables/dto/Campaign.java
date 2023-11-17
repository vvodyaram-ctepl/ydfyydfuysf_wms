package com.hillspet.wearables.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign {

	private Integer campaignId;
	private String campaignName;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<ActivityLimit> activityLimits;

	public Integer getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Integer campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<ActivityLimit> getActivityLimits() {
		return activityLimits;
	}

	public void setActivityLimits(List<ActivityLimit> activityLimits) {
		this.activityLimits = activityLimits;
	}

}
