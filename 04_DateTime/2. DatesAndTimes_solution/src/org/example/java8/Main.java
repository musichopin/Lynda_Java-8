package org.example.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalDate specificDate = LocalDate.of(2000, 12, 1);
		// year, month, day
		System.out.println(specificDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalTime specificTime = LocalTime.of(14, 0, 45);
		System.out.println(specificTime);
		
		LocalDateTime currentDT = LocalDateTime.now();
		System.out.println(currentDT);
		
		LocalDateTime specificDT = LocalDateTime.of(specificDate, specificTime);
		System.out.println(specificDT);
		
	}

}
/*
 2016-05-12
2000-12-01
08:35:28.810
14:00:45
2016-05-12T08:35:28.810
2000-01-01T14:00:45
 */
