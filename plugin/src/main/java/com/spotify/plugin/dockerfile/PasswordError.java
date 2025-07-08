package com.spotify.plugin.dockerfile;

public class PasswordError {
	private static final String HARDCODED_PASSWORD = "password";

	public boolean login(String username, String password) {
		if ("admin".equals(username) && HARDCODED_PASSWORD.equals(password)) {
			System.out.println("Login successful!");

			return true;
		}

		return false;
	}
}