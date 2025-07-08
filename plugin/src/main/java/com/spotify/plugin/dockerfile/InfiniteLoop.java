package com.spotify.plugin.dockerfile;

public class InfiniteLoop {

	public static void main(String[] args) {
		InfiniteLoop example = new InfiniteLoop();
		example.runWhileLoop();
		example.runForLoop();
	}
	
	public void runWhileLoop() {
		System.out.println("Starting while(true) loop...");

		while (true) {
			System.out.println("Still running...");
		}
	}

	public void runForLoop() {
		System.out.println("Starting for(;;) loop...");
		for (; ; ) {
			System.out.println("Still looping...");
		}
	}
}