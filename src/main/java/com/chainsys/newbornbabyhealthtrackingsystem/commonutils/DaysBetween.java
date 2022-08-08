package com.chainsys.newbornbabyhealthtrackingsystem.commonutils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetween {

	public static void main(String[] args) {

		LocalDate issuedDate = LocalDate.parse("2022-07-01");
		LocalDate returnDate = LocalDate.parse("2022-07-31");
		//
		long days = ChronoUnit.DAYS.between(issuedDate,returnDate );
		//ChronoUnit.
		System.out.println(days);
	}

}
