package ru.sergjavacode;

import java.util.Objects;

class PhoneBookEntry {
    private String name;
    private String phoneNumber;
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
        if(name.equals(that.name) && phoneNumber.equals(that.phoneNumber)){
            return true;
        } else {return false;}
    }

    @Override
    public int hashCode() {
        return name.hashCode() * phoneNumber.hashCode();
    }
}