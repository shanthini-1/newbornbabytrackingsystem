package com.chainsys.newbornbabyhealthtrackingsystem.commonutils;
import java.time.LocalDate;
import java.sql.Date;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates
{
	public static void main(String[] args)
	{
		LocalDate date1 = LocalDate.now();
//		Date dateQ = new Date(2022-10-17);
		LocalDate date2 = LocalDate.of(2022,10,17);

		long diffInDays = ChronoUnit.DAYS.between(date1, date2);

		System.out.println(diffInDays);  // 99
	}
}
