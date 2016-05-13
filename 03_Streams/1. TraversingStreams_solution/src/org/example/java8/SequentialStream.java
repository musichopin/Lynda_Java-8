package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.model.Person;

public class SequentialStream {
	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));

		Predicate<Person> pred = (p) -> p.getAge() > 65;

		displayPeople(people, pred);

	}

//	stream API helps manage, traverse and aggregate collections (list, map etc)
//	collection based stream isn't like input and output stream
//	with collection based streams we work with data as a whole 
//	instead of doing with each item individually. with streams we don't
//	need to worry about details of looping or traversing 
//	with streams we can do traversing, filtering and aggregating collection's values
//	in java 8 there are two kinds of collection streams known as sequential 
//	and parallel streams
//	sequential stream is the easier of the two, and just like an iterator
//	it lets us deal with each item in a collection one at a time but with less 
//	syntax than before
//	there is no clear prescription when to use parallel and sequential stream
	private static void displayPeople(List<Person> people,
	Predicate<Person> pred) {
		
		System.out.println("All:");
		people.stream().forEach(p -> System.out.println(p.getName()));
		
		System.out.println("Selected:");
		people.stream() // streams the person object
			.filter(pred) // filters to the predicate object.
			// used instead of test method
			.forEach(p -> System.out.println(p.getName()));
		
		// alt: 
//		people.forEach(p -> {
//			if (pred.test(p))
//			{
//				System.out.println(p.getName());
//			}			
//		});
		
		// alt:
//		for (Person person : people) {
//			if (pred.test(person)) { 
//				System.out.println(person.getName());
//			}
//		}

	}

}
/*
All:
Joe
Mary
Mike
Selected:
Mike
*/