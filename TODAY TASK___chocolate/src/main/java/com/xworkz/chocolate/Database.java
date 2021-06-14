package com.xworkz.chocolate;

public class Database {
	private String url;
	private String userName;
	private String password;

	public Database(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Database [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

}
