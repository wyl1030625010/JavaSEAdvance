package com.homework.T3.service;

import com.homework.T3.dao.BookDAO;
import com.homework.T3.domain.Book;

import java.util.ArrayList;

public class BookService {
    private BookDAO dao = new BookDAO();

    /**
     * ����id�޸�ͼ��
     * @param id
     * @param newBook
     */
    public void editBookById(String id, Book newBook) {
        boolean b = dao.editBookById(id, newBook);
        if (b) {
            System.out.println("�޸�ͼ�飺" + newBook.toString() + "�ɹ���");
            System.out.println();
        } else {
            System.out.println("�޸�ʧ�ܡ�");
        }
    }

    /**
     * ����idɾ��ͼ��
     *
     * @param id
     */
    public void delBookById(String id) {
        Book b = dao.delBook(id);
        if (b != null) {
            System.out.println("ɾ��ͼ�飺" + b.toString() + "�ɹ���");
            System.out.println();
        } else {
            System.out.println("ɾ��ʧ�ܡ�");
        }
    }

    /**
     * ��ѯ����ͼ��
     *
     * @return
     */
    public ArrayList<Book> findAllBook() {
        return dao.findAllBook();
    }

    /**
     * ���ͼ�����
     *
     * @param book
     */
    public void addBook(Book book) {
        boolean b = dao.addBook(book);

        if (b) {
            System.out.println("���ͼ�飺" + book.toString() + "�ɹ���");
            System.out.println();
        } else {
            System.out.println("���ʧ�ܡ�");
        }
    }

    /**
     * ��������id�ж��Ƿ��Ѵ���
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
