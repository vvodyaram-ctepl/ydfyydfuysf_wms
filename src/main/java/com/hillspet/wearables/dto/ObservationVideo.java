package com.hillspet.wearables.dto;

public class ObservationVideo {

	private int observationVideoId;
	private String videoName;
	private String videoUrl;
	private String videoThumbnailUrl;
	private int isDeleted;
	private String videoStartDate;
	private String videoEndDate;

	public int getObservationVideoId() {
		return observationVideoId;
	}

	public void setObservationVideoId(int observationVideoId) {
		this.observationVideoId = observationVideoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getVideoThumbnailUrl() {
		return videoThumbnailUrl;
	}

	public void setVideoThumbnailUrl(String videoThumbnailUrl) {
		this.videoThumbnailUrl = videoThumbnailUrl;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getVideoStartDate() {
		return videoStartDate;
	}

	public void setVideoStartDate(String videoStartDate) {
		this.videoStartDate = videoStartDate;
	}

	public String getVideoEndDate() {
		return videoEndDate;
	}

	public void setVideoEndDate(String videoEndDate) {
		this.videoEndDate = videoEndDate;
	}

}
