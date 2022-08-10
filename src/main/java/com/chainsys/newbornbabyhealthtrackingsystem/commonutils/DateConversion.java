package com.chainsys.newbornbabyhealthtrackingsystem.commonutils;
import java.util.Date;
//import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.services.ChildServices;

public class DateConversion {
@Autowired
private Child child;
	public static void main(String[] args) {
		// Convert LocalDate to Sql Date - insert/update/delete
		/*LocalDate today = LocalDate.now();

		Date sqlDate = Date.valueOf(today);
		System.out.println(sqlDate);
		// Convert sql Date to LocalDate (select query)

		LocalDate localDate = sqlDate.toLocalDate();
		System.out.println(localDate);*/
		Date dob = new Date(22,2,03);
		LocalDate locDate = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("dob in localdate : " + locDate);

	}

	public void demo() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a Date :");
		String date = sn.next();
		DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		/*
		 * LocalDate dobDate = LocalDate.parse(date, datetimeformat); Date sqlDate =
		 * Date.valueOf(dobDate); System.out.println("Local Date :" + dobDate);
		 * 
		 * LocalDate locdate = sqlDate.toLocalDate(); System.out.println("SQL Date" +
		 * locdate);
		 * 
		 * System.out.println("Enter no of days for add :"); int n = sn.nextInt();
		 * locdate = locdate.plusDays(n);
		 * 
		 * System.out.println("Date with addition of " + n + ": " + locdate);
		 */
//		date to localdate
		Date dob = new Date(2022,12,03);
		LocalDate locDate = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("dob in localdate : " + locDate);
	}
	

}
