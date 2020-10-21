package com.itheima.homework.T3_2;

public class Book implements Comparable<Book> {
    private String name;
    private Integer price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Book() {
    }

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        Integer recult = this.price - o.getPrice();

        return recult == 0 ? this.getName().compareTo(o.getName()) : recult;
    }
}
