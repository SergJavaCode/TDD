package ru.sergjavacode;

import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {
    private Set<PhoneBookEntry> PhoneBookSet = new TreeSet<>();

    public int add(String name, String phoneNumber) {
        PhoneBookSet.add(new PhoneBookEntry(name, phoneNumber));
        return PhoneBookSet.size();
    }
}
