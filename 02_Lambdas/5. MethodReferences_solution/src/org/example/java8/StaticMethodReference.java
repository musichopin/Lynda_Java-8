package org.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.example.java8.model.Person;

public class StaticMethodReference {
	public static void main(String args[]){
		 
		List<Person> people = new ArrayList<>();
		 
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
 
//		a method reference gives us a way of naming a method 
//		we want to call instead of calling it directly
		Collections.sort(people, Person :: compareAges);
//		collection is people and for the comparator object we use a method reference.
//		with "::" we separate type of the object from name of the method we are calling.
//		why method ref works? compareAges accepts 2 arguments returns a data   
//		type just like compare method of comparator interface
		people.forEach(p -> System.out.println(p) );
//		we passed in current person as p
	}
	
}
/*
Mary (30)
Joe (48)
Mike (73)
 */
