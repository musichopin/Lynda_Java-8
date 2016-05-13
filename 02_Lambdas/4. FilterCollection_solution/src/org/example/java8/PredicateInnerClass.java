package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.model.Person;

public class PredicateInnerClass {
	public static void main(String args[]){
		 
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		// we can use predicate interface with inner class syntax besides 
		// lambda expression
		// this interface needs a generic type declaration
		Predicate<Person> pred = new Predicate<Person>() {
			
			@Override
			public boolean test(Person p) {
//				for-each loop olmasa ne print ne de return ederdi
				return (p.getAge() >= 65); // returns true or false
			}
		};
		
		// we could have used iterator object or forEach method 
		// instead of classic for-each loop
		for (Person person : people) {
			if (pred.test(person)) { // if true then ...
				System.out.println(person);
			}
		}
		
	}
}
/*
 Mike (73) 
 */
