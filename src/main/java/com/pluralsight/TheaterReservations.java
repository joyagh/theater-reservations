package com.pluralsight;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Theater Reservations! Please enter your information below to reserve tickets");
        System.out.print("Full name: ");
        String fullName = input.nextLine();

        String[] nameString = fullName.split(" ");
        String firstName = nameString[0];
        String lastName = nameString[1];

        System.out.println("DAte of reservation: ");
        String date = input.next();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate reserveDay = LocalDate.parse(date, format);

        System.out.println("Ticket Count: ");
        int ticketCount = input.nextInt();

        if(ticketCount == 1){
            System.out.println(ticketCount + "ticket reserved for " + reserveDay + "under " + lastName + "," + firstName);
        }

    }
}
