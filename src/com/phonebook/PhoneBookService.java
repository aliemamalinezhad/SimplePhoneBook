package com.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBookService {
    private final HashMap<String, PhoneBook> map;
    public PhoneBookService() {
        map = new HashMap<>();
    }

    public void addItem(PhoneBook phoneBook){
        map.put(phoneBook.getLastName(), phoneBook);
    }

    public PhoneBook findByLastName(String lastName) {
        for (Map.Entry<String, PhoneBook> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.equals(lastName)) {
                return entry.getValue();
            }
        }
        System.out.println("This lastName does not exists");
        return null;
    }

    public List<PhoneBook> findAll() {
        List<PhoneBook> phoneBookList = new ArrayList<>();
        for (Map.Entry<String, PhoneBook> entry : map.entrySet()) {
            PhoneBook value = entry.getValue();
            phoneBookList.add(value);
        }
        return phoneBookList;
    }
}
