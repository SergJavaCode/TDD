package ru.sergjavacode;

class PhoneBookEntry implements Comparable{
    private String name;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String phoneNumber;

    PhoneBookEntry(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Object o) {
        PhoneBookEntry compareObject = (PhoneBookEntry) o;
        return this.name.compareTo(compareObject.name);
    }

}