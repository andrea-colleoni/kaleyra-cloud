package com.kaleyra.cloud.secureapp;

public class GithubUser {

	
	@Override
	public String toString() {
		return "GithubUser [login=" + login + ", email=" + email + "]";
	}
	public GithubUser() {
		super();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String login;
	private String email;
}
