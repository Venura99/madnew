package com.example.newwork;

public class Customer {

    String name;
    String address1;
    String address2;
    String address3;
    String phone;
    String email;

    public Customer(String name, String address1, String address2, String address3, String phone, String email) {
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getAddress3() {
        return address3;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
