package com.phonebook;

import java.util.*;

public class PhoneBookService {
    private final HashMap<String, PhoneBook> map;
    public PhoneBookService() {
        map = new HashMap<>();
    }

    public void addContact(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter new name please : ");
        String name = scanner.nextLine();

        System.out.println("Enter new Phone Number please : ");
        String phoneNumber = scanner.nextLine();

        PhoneBook phoneBook = new PhoneBook(name, phoneNumber);
        map.put(name, phoneBook);

        System.out.println("New Number Added Successfully \n");
    }

    public void findContactByLastName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name to search for: ");
        String name = scanner.nextLine();
        boolean found = false;
        for(Map.Entry<String, PhoneBook> entry: map.entrySet()){
            String key = entry.getKey();
            if(key.equals(name)){
                System.out.println("Contact found: " + entry.getValue());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Contact with name " + name + " not found.");
        }
    }

    public List<PhoneBook> showAllContacts() {
        List<PhoneBook> phoneBookList = new ArrayList<>();
        for (Map.Entry<String, PhoneBook> entry : map.entrySet()) {
            PhoneBook value = entry.getValue();
            phoneBookList.add(value);
        }
        return phoneBookList;
    }
}
