package com.spotify.plugin.dockerfile;

public class NullEquals {

	public static void main(String[] args) {
		NullEquals validator = new NullEquals();
		boolean result = validator.isGuestUser(null);
		
		System.out.println("Is guest: " + result);
	}

	public boolean isGuestUser(String username) {
		// username이 null일 수 있음
		if (username.equals("guest")) {

			return true;
		}

		return false;
	}
}