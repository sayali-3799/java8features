package com.te.java8feature;

public interface PhoneCall {
	void busyMessage();
	default void covidAlert() {
		System.out.println("Amithabh Bachchan is speaking ");
	}

}
