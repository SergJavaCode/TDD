package ru.sergjavacode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {
    private Set<PhoneBookEntry> phoneBookSet = new TreeSet<>(Comparator.comparing(PhoneBookEntry::getName)
            .thenComparing(PhoneBookEntry::getPhoneNumber));

    public int add(String name, String phoneNumber) {
        phoneBookSet.add(new PhoneBookEntry(name, phoneNumber));
        return phoneBookSet.size();
    }

    public String findByNumber(String phoneNumber) {
        Iterator<PhoneBookEntry> itr = phoneBookSet.iterator();
        PhoneBookEntry phoneBookEntry;
        while (itr.hasNext()) {
            phoneBookEntry=itr.next();
            if (phoneBookEntry.getPhoneNumber().equals(phoneNumber)) {
                return phoneBookEntry.getName();
            }
        }
        return "Абонент с номером " + phoneNumber + " не существует.\n";
    }

    public String findByName(String name){
        Iterator<PhoneBookEntry> itr = phoneBookSet.iterator();
        PhoneBookEntry phoneBookEntry;
        while (itr.hasNext()) {
            phoneBookEntry=itr.next();
            if (phoneBookEntry.getName().equals(name)) {
                return phoneBookEntry.getPhoneNumber();
            }
        }
        return "Абонент с именем " + name + " не существует.\n";
    }
    public Set<PhoneBookEntry> printAllNames(){
        return null;
    }
}
