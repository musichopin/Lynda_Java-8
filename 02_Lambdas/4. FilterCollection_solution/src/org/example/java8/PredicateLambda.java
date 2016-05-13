package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.model.Person;
// predicate interface has a single boolean method named test
// it is used to wrap up conditional processing 
// and make conditional code a lot cleaner
public class PredicateLambda {
	
	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
//		we use lambda expression to implement the predicate interface
//		and its abstract test method
		
//		lambda olmasa ne print ne de return ederdi
//		(p) yerine p yazýlabilir tek argument olduðu için
		Predicate<Person> predOlder = (p) -> p.getAge() >= 65;
		Predicate<Person> predYounger = (p) -> p.getAge() <= 40;
//		we can add as many predicate objects as we like 
//		each representing a different situation
		
		people.forEach( p -> { // p: name of the object ref variable we pass in as an argument
			if (predOlder.test(p)) { // if true then ... 
				System.out.println(p); // p.toString()
//				people arraylist ref variableý p olarak ayrýþýyor
			}
		});
		
		for (Person person : people) {
			if (predYounger.test(person)) { // there is test abstract method in predicate interface
				System.out.println(person.toString());
			}
		}
		
		System.out.println();
		displayPeople(people, predOlder);
		displayPeople(people, predYounger);
		// it is more correct to pass reference variables
		// into method
	}
	
	private static void displayPeople(List<Person> people,
			Predicate<Person> pred) {
		people.forEach(p -> {
			if (pred.test(p)) {
//				people arraylist ref variableý p variable olarak tek tek pass ediliyor
				System.out.println(p);
			}
		});
	}

}
/*
Mike (73)
Mary (30)

Mike (73)
Mary (30)
*/