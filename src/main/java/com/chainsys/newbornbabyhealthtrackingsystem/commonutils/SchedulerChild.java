package com.chainsys.newbornbabyhealthtrackingsystem.commonutils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SchedulerChild {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String date = sc.nextLine();
		DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dobDate = LocalDate.parse(date, datetimeformat);
		System.out.println("name : " + name);
		System.out.println("dob : " + dobDate);
		
	}

}