package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.interfaces.PersonInterface;
import org.example.java8.model.Person;

public class UseStaticMethod {
	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));

		Predicate<Person> pred = (p) -> p.getAge() > 65;

		displayPeople(people, pred);

	}

	private static void displayPeople(List<Person> people,
			Predicate<Person> pred) {
		System.out.println("Selected:");
		people.forEach(p -> {
//			p ref var -> people ref var -> people ref var-> Person class
			if (pred.test(p))
			{
//				! p ref variable'� argumentte pass edilerek
//				person class'dan olu�an her object i�in e�le�me imkan� sa�land�.
				String info = PersonInterface.getPersonInfo(p);
				System.out.println(info);
//				alt: before java 8
//				String info = p.getName() + "( " + p.getAge() + ")";
//				System.out.println(info);
			}			
		});
	}
	
}
/*
Selected:
Mike (73)
*/