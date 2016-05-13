package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import org.example.java8.model.Person;

public class SumAndAverage {

	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		int sum = people.stream()
//				purpose of mapToInt method is to take a complex object 
//				and extract a simple primitive value from it and 
//				create a stream of those values
				.mapToInt(p -> p.getAge())
//				Person classa ait people ref var p olarak ayrýþýyor
				.sum();
//				since we have a numeric value we call the sum method
//				we sum up all ages values from all the person objects in the collection (list)
		System.out.println("Total of ages: " + sum);
		
		OptionalDouble avg = people.stream() 
//				OptionalDouble: result might be double. it is a class name
				.mapToInt(p -> p.getAge())
				.average();
		
//		in case of a "divide by zero situation" we might not get a double value back
//		we make sure if there is actual double value
		if (avg.isPresent()) {
			System.out.println("Average: " + avg.getAsDouble());
//			avg references Double class which is a complex object
		} else {
			System.out.println("Average not calculated");
		}
						
	}
	
}
/*
Total of ages: 151
Average: 50.333333333333336
*/