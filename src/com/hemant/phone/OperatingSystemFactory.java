package com.hemant.phone;

public class OperatingSystemFactory {
	
	public OS getInstance(String os) {
		if(os.equalsIgnoreCase("open")) {
			return new Android();
		} else if(os.equalsIgnoreCase("secure")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
