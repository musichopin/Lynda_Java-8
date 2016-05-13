package org.example.java8;

import java.util.ArrayList;
import java.util.List;

//besides iterating we can also use streams for aggregating items in the collection
//that is calculate sums, averages, counts and so on
public class CountItems {
	public static void main(String args[]){

		System.out.println("Creating list");
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			strings.add("Item " + i);
		}
		
//		strings.stream()
//			.forEach(str -> System.out.println(str));
		
		long count = strings.stream().parallel().count();
		System.out.println("Count: " + count);
		
		// alt: sequential stream takes less time to execute so is more feasible
//		long count = strings.stream().count();
//		System.out.println("Count: " + count);
	
	}
	
}
/*
Creating list
Count: 1000000
*/