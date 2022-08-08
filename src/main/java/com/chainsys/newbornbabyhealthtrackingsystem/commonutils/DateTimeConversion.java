package com.chainsys.newbornbabyhealthtrackingsystem.commonutils;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class DateTimeConversion {

	public static void main(String[] args) {
		// Convert LocalDate to Sql Date - insert/update/delete
		LocalDateTime createdDate = LocalDateTime.now();

		Timestamp sqlDate = Timestamp.valueOf(createdDate);
		System.out.println(sqlDate);
		// Convert sql Date to LocalDate (select query)

		LocalDateTime localDate = sqlDate.toLocalDateTime();
		System.out.println(localDate);

	}

}
