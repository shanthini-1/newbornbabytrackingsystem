package com.chainsys.newbornbabyhealthtrackingsystem.commonutils;

import java.time.LocalDate;
import java.util.Scanner;

public class DateValidation {
	public static void validateStudentDetails(String name, int age, LocalDate dob) throws Exception {

		if (name == null || name.equals("") || name.trim().equals("")) {
			throw new Exception("Name cannot be null"); // Raise a problem
		} else if (age < 0) {
			throw new Exception("Age must be greater than zero");
		} else if (dob.isAfter(LocalDate.now())) {
			throw new Exception("DOB cannot be greater than current date");
		}
		System.out.println("Validation Method completed");
	}

	public static void main(String[] args) {

		// Input
		String name = "Ramesh";
		int age = 20;
		Scanner s = new Scanner(System.in);
		// Get date as string and parse to LocalDate
		String date = s.next();
		// LocalDate dob = LocalDate.parse("2022-01-01");
		LocalDate dob = LocalDate.parse(date);
		LocalDate today = LocalDate.now();
		if (dob.isBefore(today))
			try {
				// validation
				validateStudentDetails(name, age, dob);
				// if validation is success
				System.out.println("Validation Passed");

			} catch (Exception ex) {
				// if validation failed
				ex.printStackTrace();
				System.out.println("Exception:" + ex.getMessage());
			}
		else {
			System.out.println("invalid date");
		}

	}

}
