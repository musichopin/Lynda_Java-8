package org.example.java8;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {
	public static void main(String args[]){

		System.out.println("Creating list");
		List<String> strings = new ArrayList<>();
//		listeye item ekleme iþlemi loop ile yapýlmýþ
		for (int i = 0; i < 30; i++) {
			strings.add("Item " + i);
			// string type için int kullanýlabiliyor
		}
		
//		parallel stream mixes up the result
		strings.stream()
		.parallel()
		.forEach(str -> System.out.println(str));
		
		// alt: sequential stream sýrayla print ederdi
//		strings.stream().forEach(str -> System.out.println(str));

	}

}
/*
Creating list
Item 9
Item 10
Item 7
Item 13
Item 14
Item 11
Item 12
Item 18
Item 19
Item 20
Item 21
Item 8
Item 5
Item 6
Item 0
Item 26
Item 27
Item 28
Item 29
Item 24
Item 25
Item 22
Item 23
Item 15
Item 3
Item 4
Item 16
Item 17
Item 1
Item 2
*/