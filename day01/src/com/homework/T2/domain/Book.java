package com.homework.T2.domain;

public class Book {
    private Integer id;
    private String name;
    private Double price;
    private String address;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book(Integer id, String name, Double price, String address) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.address = address;
    }

    public Book() {
    }
}
