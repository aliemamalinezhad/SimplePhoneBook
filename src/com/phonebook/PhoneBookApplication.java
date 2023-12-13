package com.phonebook;

public class PhoneBookApplication {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("Ali",
                "Emamalinezhad", 9100066078L);
        PhoneBook phoneBook2 = new PhoneBook("Borna",
                "Najafi", 9120066078L);


        PhoneBookService service =new PhoneBookService();
        service.addItem(phoneBook);
        service.addItem(phoneBook2);
        System.out.println(service.findByLastName("Najafi"));
        System.out.println(service.findAll());
    }
}
