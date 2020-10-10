package com.homework.T3.service;

import com.homework.T3.dao.BookDAO;
import com.homework.T3.domain.Book;

import java.util.ArrayList;

public class BookService {
    private BookDAO dao = new BookDAO();

    /**
     * 根据id修改图书
     * @param id
     * @param newBook
     */
    public void editBookById(String id, Book newBook) {
        boolean b = dao.editBookById(id, newBook);
        if (b) {
            System.out.println("修改图书：" + newBook.toString() + "成功。");
            System.out.println();
        } else {
            System.out.println("修改失败。");
        }
    }

    /**
     * 根据id删除图书
     *
     * @param id
     */
    public void delBookById(String id) {
        Book b = dao.delBook(id);
        if (b != null) {
            System.out.println("删除图书：" + b.toString() + "成功！");
            System.out.println();
        } else {
            System.out.println("删除失败。");
        }
    }

    /**
     * 查询所有图书
     *
     * @return
     */
    public ArrayList<Book> findAllBook() {
        return dao.findAllBook();
    }

    /**
     * 添加图书操作
     *
     * @param book
     */
    public void addBook(Book book) {
        boolean b = dao.addBook(book);

        if (b) {
            System.out.println("添加图书：" + book.toString() + "成功！");
            System.out.println();
        } else {
            System.out.println("添加失败。");
        }
    }

    /**
     * 根据输入id判断是否已存在
     * @param id
     * @return
     */
    public boolean findById(String id) {
        ArrayList<Book> allBook = dao.findAllBook();
        for (int i = 0; i < allBook.size(); i++) {
            Book book = allBook.get(i);
            if (id.equals(book.getId())) {
                return true;
            }
        }
        return false;
    }
}
