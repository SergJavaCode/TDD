package ru.sergjavacode;

public class PhoneBookEntry {
    private final String name;
    private final String phoneNumber;
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    PhoneBookEntry(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        PhoneBookEntry that = (PhoneBookEntry) o;
        return name.equals(that.name) && phoneNumber.equals(that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return name.hashCode() * phoneNumber.hashCode();
    }


    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}