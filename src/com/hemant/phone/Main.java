package com.hemant.phone;

public class Main {

	public static void main(String[] args) {
		
		OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
		OS os = operatingSystemFactory.getInstance("open");
		os.spec();
		
	}
}
