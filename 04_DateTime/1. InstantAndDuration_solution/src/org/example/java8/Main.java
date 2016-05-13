package org.example.java8;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Instant start = Instant.now(); // instant: class
		// now: static method of instant class
		System.out.println(start);
		// start reference variable'ýnýn doðrudan print edilebilmesine dikkat
		
		Thread.sleep(1000);
		
		Instant end = Instant.now();
		System.out.println(end);
	
		Duration elapsed = Duration.between(start, end);
		
		System.out.println("Elapsed: " + elapsed.toMillis() + " milliseconds");
	
	}

}
/*
 2016-05-12T05:35:14.540Z
2016-05-12T05:35:15.671Z
Elapsed: 1131 milliseconds 
 */
