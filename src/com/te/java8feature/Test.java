package com.te.java8feature;

public interface Test {
	default void m1() {
		System.out.println("From Test");
	}
}
