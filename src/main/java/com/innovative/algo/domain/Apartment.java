package com.innovative.algo.domain;

public class Apartment {
    private Integer Id;
    private Address address;

    public Integer getId() {
        return Id;
    }

    public Apartment setId(Integer id) {
        Id = id;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Apartment setAddress(Address address) {
        this.address = address;
        return this;
    }
}
