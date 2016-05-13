package org.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {
	
	public static void main(String args[]){
		 
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("EEE");
 
		//Simple case-sensitive sort operation
		Collections.sort(strings); 
		// we call the collection class' static sort method
		System.out.println("Simple sort");
		for(String str: strings){
			System.out.println(str);
		}
		
		// there are 3 elements:
		// 1. built-in interface, 2. lambda expression 
		// (alt: anonymous class ve implementing class) 
		// 3. lambda expressioný çaðýrmak
		Comparator<String> comp = (str1, str2) -> {
			//Case-insensitive sort with lambda expression.
			// types of the arguments depends on the generic declaration: "<...>"
			// Comparator interface has compare abstract method
			return str1.compareToIgnoreCase(str2);
		};
		Collections.sort(strings, comp);
		// alt:
//		Collections.sort(strings, (str1, str2) -> {
//			return str1.compareToIgnoreCase(str2);
//		});
		
//		alt: Case-insensitive sort with an anonymous class
//		Collections.sort(strings, new Comparator<String>() {
		// we are not naming the Comparator object,
		// but declaring and passing into the sort method
//			@Override
//			public int compare (String str1, String str2) {
		// returns an integer value, integer value can be either -1, 0 or 1
		// depending on the comparison
//				return str1.compareToIgnoreCase(str2);
//			}
//		});
		System.out.println("Sort with comparator");
		for(String str: strings){
			System.out.println(str);
		}
		
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
