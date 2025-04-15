package com.java.core;

public class BasePath {
	public static void main(String[] args) {
		String urlPath = "https://localuat/patientService/ukmif/v2/parties";
		String basePath = getBasePath(urlPath);
		System.out.println("Base Path: " + basePath);
	}

	public static String getBasePath(String urlPath) {
		String[] segments = urlPath.split("/");
		if (segments.length >= 2) {
			return "/" + segments[0] + "/" + segments[1];
		} else {
			return "";
		}
	}
}
