package org.example.java8;

import java.util.Arrays;
import java.util.stream.Stream;

import org.example.java8.model.Person;
		
public class ArrayToStream {
	public static void main(String args[]){
		
		Person[] people = {
				new Person("Joe", 48), 
				new Person("Mary", 30),
				new Person("Mike", 73)};
		
//		streams can also be created directly from arrays
//		there are a couple of ways to directly go from an array to stream:
		Stream<Person> stream = Stream.of(people);
//		Stream: interface
//		<Person>: generic type of the items that the stream would manage
//		Stream.of(people) means that take Person array and wrap inside a stream
		
		// alt:
//		Stream<Person> stream = Arrays.stream(people);
		// Stream: interface | stream: method
		// Arrays is a part of java.util.Arrays
		
		stream.forEach(p -> System.out.println(p.getInfo()));
//		we can use lambda expressions (for-each loop), filters (for-each loop),  
//		method references, for loop, for each loop and other things that work 
//		on Stream object
		
		// alt:
//		for (int i = 0; i < people.length; i++) {
//		System.out.println(people[i].getInfo());
//		}
	}

}
/*
Joe (48)
Mary (30)
Mike (73)
*/