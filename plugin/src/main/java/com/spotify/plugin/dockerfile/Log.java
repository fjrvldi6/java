package com.spotify.plugin.dockerfile;

public class Log {

	public User getUserById(String id) {
		System.out.println("Searching for user with ID: " + id);
		User user = new User(id, "test-user");
		System.out.println("Found user: " + user.getName());
		
		return user;
	}
}

class User {
	private String id;
	private String name;

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}
}