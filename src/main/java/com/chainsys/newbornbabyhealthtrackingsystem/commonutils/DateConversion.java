package com.chainsys.newbornbabyhealthtrackingsystem.commonutils;

import java.sql.Date;
import java.time.LocalDate;

public class DateConversion {

	public static void main(String[] args) {
		// Convert LocalDate to Sql Date - insert/update/delete
		LocalDate today = LocalDate.now();

		Date sqlDate = Date.valueOf(today);
		System.out.println(sqlDate);
		// Convert sql Date to LocalDate (select query)

		LocalDate localDate = sqlDate.toLocalDate();
		System.out.println(localDate);

	}

}
