package com.yash.payload;

public class ProjectTaskIdResponse {

	private String projectTaskIdentifier;

	public ProjectTaskIdResponse(String projectTaskIdentifier) {
		this.projectTaskIdentifier = projectTaskIdentifier;
	}

	public String getProjectTaskIdentifier() {
		return projectTaskIdentifier;
	}

	public void setProjectTaskIdentifier(String projectTaskIdentifier) {
		this.projectTaskIdentifier = projectTaskIdentifier;
	}

}
