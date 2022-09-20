package com.chapter5.diary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Diary {

    private Database database;
    private Scanner scanner = new Scanner(System.in);


    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/y");


    public Diary() {

        database = new Database();
    }

    private LocalDateTime readDateTime() {
        System.out.println("Enter date and time as mm/dd/yyyy hh:mm");
        LocalDateTime dateTime;
        try {
            dateTime = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("Error . please try again.");
            return readDateTime();
        }
        return dateTime;
    }

    private LocalDate readDate() {
        System.out.println("Enter date as mm/dd/yyyy");
        LocalDate date;
        try {
            date = LocalDate.parse(scanner.nextLine(), dateFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("Please try again.");
            return readDate();
        }
        return date;

    }

    public void printEntries(LocalDate day) {
        ArrayList<Entry> entries = database.findEntries(day.atStartOfDay(), false);
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }
        public void addEntry () {
            LocalDateTime dateTime = readDateTime();
            System.out.println("Enter the entry text: ");
            String text = scanner.nextLine();
            database.addEntry(dateTime, text);
        }

        public void searchEntries () {
            LocalDateTime dateTime = readDate().atStartOfDay();
            ArrayList<Entry> entries = database.findEntries(dateTime, false);
            if (entries.size() > 0) {
                System.out.println("Entries found: ");
                for (Entry entry : entries) {
                    System.out.println(entry);
                }
            } else {
                System.out.println("No entries were found.");
            }
            scanner.nextLine();
        }
        public void deleteEntries () {
            System.out.println("Entries with the same exact date and time will be deleted");
            LocalDateTime dateTime = readDateTime();
            database.deleteEntries(dateTime);
        }
        public void printHomeScreen () {
            System.out.println();
            System.out.println();
            System.out.println("Welcome to your virtual diary!");
            System.out.println("Today is: " + LocalDateTime.now().format(dateTimeFormatter));
            System.out.println();
            // printing the home screen
            System.out.println("Today:\n------");
            printEntries(LocalDate.now());
            System.out.println();
            System.out.println("Tomorrow:\n---------");
            printEntries(LocalDate.now().plusDays(1));
            System.out.println();
        }


    }

