package com.hafeez.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppUtil {
	
	
	private static final String HOSTNAME;
	static {
		try {
			HOSTNAME=InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	public static String getHostName() {
		return HOSTNAME;
	}

}
