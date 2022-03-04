package com.zeuspc.springWebapp.dao;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Name;
    private String Address;
    private String City;
    private String State;
    private String Zip;

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher(){}

    public Publisher(String name, String address, String city, String state, String zip)
    {
        Name = name;
        Address = address;
        City = city;
        State = state;
        Zip = zip;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return id != null ? id.equals(publisher.id) : publisher.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
