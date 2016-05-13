package org.example.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dtf.format(dt));
		
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
		System.out.println(dtf.format(gmt));
		
		ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(dtf.format(ny));
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		// generic type of items in the set are set to string
		
		// to get all the available time zone names:
//		zones.forEach(z -> System.out.println(z));
		
//		forEach metodu olmasayd� print edilemezdi
//		str veya (str) olmas� fark etmez tek argument oldu�u i�in
		Predicate<String> condition = str -> str.contains("London");  // returns true or false
//		str'nin type'� Set interface (?)
		
		zones.forEach(z -> {
			if (condition.test(z)) { // if true then...
				System.out.println(z);
//				zones interface ref variable'� z variable olarak tek tek ayr���yor ve pass ediliyor
			}
		});
		
	}

}
/*
12.05.2016 10:10
12.05.2016 07:10
12.05.2016 03:10
Europe/London 
 */
