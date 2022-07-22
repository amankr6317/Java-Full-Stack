package com.yash.payload;

public class ProjectNotFoundResponse {

	private String ProjectNotFound;

	public ProjectNotFoundResponse(String projectNotFound) {
		ProjectNotFound = projectNotFound;
	}

	public String getProjectNotFound() {
		return ProjectNotFound;
	}

	public void setProjectNotFound(String projectNotFound) {
		ProjectNotFound = projectNotFound;
	}

}
