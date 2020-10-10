package com.homework.T3.dao;

import com.homework.T3.domain.Book;

import java.util.ArrayList;

public class BookDAO {
    private static ArrayList<Book> books = new ArrayList<>();

    public boolean editBookById(String id, Book newBook) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            int index = books.indexOf(book);
            if (id.equals(book.getId())) {
                books.set(index, newBook);
                return true;
            }
        }
        return false;
    }

    /**
     * 删除图书操作
     *
     * @param id
     * @return
     */
    public Book delBook(String id) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (id.equals(book.getId())) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }

    /**
     * 查询所有图书
     *
     * @return
     */
    public ArrayList<Book> findAllBook() {
        return books;
    }


    /**
     * 添加书本操作
     *
     * @param book
     * @return
     */
    public boolean addBook(Book book) {
        boolean add = books.add(book);

        return add;
    }
}
