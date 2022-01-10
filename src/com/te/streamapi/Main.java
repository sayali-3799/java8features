package com.te.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student("sayali", 10, 22, 85), new Student("sanjana", 20, 25, 75),
				new Student("sanjay", 30, 23, 65), new Student("shashi", 40, 30, 50),new Student("hemanth", 50, 45, 45));
		
		//sorting
		List<Student> collect = list.stream().sorted(Comparator.comparing(Student::getSid)).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		System.out.println("******");
		
		//minimum
		Optional<Student> min = list.stream().min(Comparator.comparing(Student::getMarks));
		System.out.println(min);
		
		System.out.println("**********");
		
		//max
		Optional<Student> max = list.stream().max(Comparator.comparing(Student::getMarks));
		System.out.println(max);
		
		System.out.println("***********");
		
		//filter
		List<Student> collect2 = list.stream().filter(sm->sm.getMarks()>65).collect(Collectors.toList());
		collect2.forEach(System.out::println);
		
	}

	
	
}
