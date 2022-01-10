package com.te.lambdaexpression;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.te.streamapi.Employee;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,6,7,8,89,99);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		for(Integer integer:list) {
			System.out.println(integer);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==========================================");
		list.forEach(System.out::println);
		
		
		
			

		}
	}
