package com.tnsif.lambdademo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class DateTimeExample {
	public static void main(String[] args) {

        // Current Date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Current Time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Current Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
	}

}
