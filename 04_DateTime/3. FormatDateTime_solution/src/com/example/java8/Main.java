package com.example.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter df  = DateTimeFormatter.ISO_DATE;
//		ISO_DATE: constant of DateTimeFormatter class
		System.out.println(df.format(currentDate));
//		we call the format method of DateTimeFormatter object and pass in the LocalDate object
		
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter tf  = DateTimeFormatter.ISO_TIME;
		System.out.println(tf.format(currentTime));
		
		LocalDateTime currentDT = LocalDateTime.now();
		DateTimeFormatter dtf  = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(dtf.format(currentDT));
		
		System.out.println();
		DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(f_long.format(currentDT));
		
		DateTimeFormatter f_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(f_short.format(currentDT));
		
		System.out.println();
		String fr_short = f_short.withLocale(Locale.FRENCH).format(currentDT);
		String fr_long = f_long.withLocale(Locale.FRENCH).format(currentDT);
		System.out.println(fr_short);
		System.out.println(fr_long);
		// alt:
//		DateTimeFormatter fr_short = f_short.withLocale(Locale.FRENCH);
//		System.out.println(fr_short.format(currentDT));
		
		System.out.println("Customized");
		DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
			.appendValue(ChronoField.MONTH_OF_YEAR)
			.appendLiteral("||")
			.appendValue(ChronoField.DAY_OF_MONTH)
			.appendLiteral("||")
			.appendValue(ChronoField.YEAR);
		DateTimeFormatter f = b.toFormatter();
		
		System.out.println(f.format(currentDT));
		
	}

}
/*
 2016-05-12
09:41:16.319
2016-05-12T09:41:16.321

12 Mayýs 2016 Perþembe
12.05.2016

12/05/16
12 mai 2016

5||12||2016 
 */
