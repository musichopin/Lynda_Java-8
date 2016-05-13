package org.example.java8;

// hangi interface ve classlarýn import edildiðine dikkat
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
// Custom Main Class -> ArrayList -> Iterable Interface -> a. forEach method 
// (has Functional Interface named consumer as argument) b. Iterator method

// Traversing a collection simply means doing a loop that 
// visits every element of the collection. we can use forEach method (alternatively with a lambda expression)
// for that in java 8 as well as for-each loop and iterator objects. all of the collections' data types 
// (such as lists, maps and sets) implement an interface named iterable 
// (ayrýca baþka interfaceler de implement ediyorlar)
public class Main {
	public static void main(String args[]){
		 
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
		
		// Simple case-sensitive sort operation
		Collections.sort(strings);
		System.out.println("Simple sort");

		// forEach is alternative to for-each loop and iterator
		// forEach method accepts an instance of a functional interface named consumer
		// the consumer interface has a single abstract method named accept.
		// because consumer interface is a functional interface 
		// we can use a lambda expression.
		strings.forEach(str -> System.out.println(str));
		// alt:
//		Consumer<String> x = (str) -> System.out.println(str);
//		strings.forEach(x);
		// ! sadece x'in (metod vs olmadan) pass edilmesine dikkat
		
		// alt: anonymous class (?)
//		Consumer<String> x = new Consumer(){
//			@Override
//			public void accept(Object t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		};
//		
//		strings.forEach(x);
		
		// alt: Traverse with for each loop
//		for(String str: strings){
//			System.out.println(str);
//		}
		
		// Case Insensitive Sort with lambda expression
		Comparator<String> comp = (str1, str2) ->
		{
			return str1.compareToIgnoreCase(str2);
		};
		Collections.sort(strings, comp);
		
		System.out.println("Sort with comparator");
		
		strings.forEach(str -> System.out.println(str));
		//	str -> System.out.println(str) : accept method için lambda
		// we pass the lambda expression into the forEach method
		// calling the forEach method of the Iterable Interface of the collection
		
		// alt: Traverse with iterator (another approach to for-each loop and forEach method)
		// we are calling the iterator method of the collection,
		// getting an iterator object and looping with a while code block
		// calling the iterator's hasNext method
//		Iterator<String> i = strings.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}

	}
}
/*
 Simple sort
AAA
CCC
EEE
bbb
ddd
Sort with comparator
AAA
bbb
CCC
ddd
EEE 
 */
