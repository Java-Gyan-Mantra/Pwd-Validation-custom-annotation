package com.custom.ann;

public class Request {
	@PwdValidator(message = "Invalid Password retry")
	public String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;

	}
}
