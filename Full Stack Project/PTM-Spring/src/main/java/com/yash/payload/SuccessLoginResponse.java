package com.yash.payload;

public class SuccessLoginResponse {

	private boolean success;

	private String token;

	public SuccessLoginResponse(boolean success, String token) {
		this.success = success;
		this.token = token;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
