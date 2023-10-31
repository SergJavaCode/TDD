package ru.sergjavacode;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {
    private Set<PhoneBookEntry> phoneBookSet = new TreeSet<>();

    public int add(String name, String phoneNumber) {
        phoneBookSet.add(new PhoneBookEntry(name, phoneNumber));
        return phoneBookSet.size();
    }

    public String findByNumber(String phoneNumber) {
      return null;
    }
}
