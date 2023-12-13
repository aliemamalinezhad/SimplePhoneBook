package com.phonebook;

import java.util.Scanner;

public class PhoneBookApplication {

    public static void main(String[] args) {
        PhoneBookService service = new PhoneBookService();

        System.out.println("Welcome to Phone Book Application");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Press (A) to Add new contact");
            System.out.println("Press (S) to Show All Contacts");
            System.out.println("Press (F) to Find a contact by last name");
            System.out.println("Press (Q) to Exit the program");

            String input = scanner.nextLine().toUpperCase();
            switch (input) {
                case "A" -> service.addContact();
                case "S" -> System.out.println(service.showAllContacts());
                case "F" -> service.findContactByLastName();
                case "Q" -> {
                    System.out.println("Are you sure you want to exit? (Y/N)");
                    String confirmExit = scanner.nextLine().toUpperCase();
                    if (confirmExit.equals("Y")) {
                        System.out.println("Exiting the program...");
                        System.exit(0);
                    }
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
