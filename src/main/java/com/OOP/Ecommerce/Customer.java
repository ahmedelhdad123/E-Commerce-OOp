package com.OOP.Ecommerce;

import com.OOP.Ecommerce.personalInfo.PersonalInformation;

public class Customer extends PersonalInformation {
    private String address;
    private String email;

    public Customer() {
    }

    public Customer(Long id, String name, String address, String email) {
        super(id, name);
        this.address = address;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id="+getId()+
                ", name='"+getName()+'\'' +
                "address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
