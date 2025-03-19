package com.java.core.multithreading;

public class ThreadDto extends Thread {
	
	public ThreadDto() {
		
	}
	@Override
	public void run() {
		System.out.println("ThreadDto.run()");
		
	}
}
