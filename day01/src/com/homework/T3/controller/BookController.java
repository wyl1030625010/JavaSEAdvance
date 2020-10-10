package com.homework.T3.controller;

import com.homework.T3.domain.Book;
import com.homework.T3.service.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class BookController {
    private BookService bookService = new BookService();

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------��ӭ����ͼ�����ϵͳ-------");
            System.out.println("����������1.����ͼ�� 2.ɾ��ͼ�� 3.�޸�ͼ�� 4.�鿴ͼ�� 5.�˳�ϵͳ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    addBook();
                    break;
                case 2:
                    delBookById();
                    break;
                case 3:
                    editBookById();
                    break;
                case 4:
                    findAllBook();
                    break;
                case 5:
                    System.out.println("��л����ʹ��");
                    return;
                default:
                    System.out.println("��������");

            }
        }
    }

    /**
     * ����id�޸�ͼ��
     */
    private void editBookById() {
        String id;
        Scanner sc = new Scanner(System.in);

        System.out.println("�޸�ͼ��...");

        while (true) {
            System.out.print("������ͼ��id��");
            id = sc.next();
            boolean byId = bookService.findById(id);
            if (byId) {
                break;
            } else {
                System.out.println("id *" + id + "* �����ڣ����������롣");
                if (flag()) {
                    System.out.println();
                    return;
                }
            }
        }

        System.out.print("��������ͼ�����ƣ�");
        String newName = sc.next();
        System.out.print("��������ͼ��۸�");
        Double newPrace = sc.nextDouble();
        System.out.print("��������ͼ���ַ��");
        String newAddress = sc.next();

        Book newBook = new Book(id, newName, newPrace, newAddress);

        bookService.editBookById(id, newBook);
    }

    /**
     * ����idɾ��ͼ��
     */
    private void delBookById() {
        String id;

        Scanner sc = new Scanner(System.in);
        System.out.println("ɾ��ͼ��...");

        while (true) {
            System.out.print("������ͼ��id��");
            id = sc.next();
            boolean byId = bookService.findById(id);
            if (byId) {
                break;
            } else {
                System.out.println("id *" + id + "* �����ڣ����������롣");
                if (flag()) {
                    System.out.println();
                    return;
                }
            }
        }

        bookService.delBookById(id);
    }


    /**
     * ��ѯ����ͼ�����
     */
    private void findAllBook() {
        System.out.println("�鿴ͼ��...");
        ArrayList<Book> allBook = bookService.findAllBook();
        System.out.println("���\t����\t�۸�\tλ��");
        for (int i = 0; i < allBook.size(); i++) {
            Book book = allBook.get(i);
            System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getPrice() + "\t" + book.getAddress());
        }
        System.out.println();
    }


    /**
     * ���ͼ�����
     */
    private void addBook() {
        String id;
        Scanner sc = new Scanner(System.in);
        System.out.println("����ͼ��...");

        while (true) {
            System.out.print("������ͼ��id��");
            id = sc.next();
            boolean byId = bookService.findById(id);
            if (byId) {
                System.out.println("id *" + id + "* �Ѵ��ڣ����������롣");
                if (flag()) {
                    System.out.println();
                    return;
                }
            } else {
                break;
            }
        }

        System.out.print("������ͼ�����ƣ�");
        String name = sc.next();
        System.out.print("������ͼ��۸�");
        Double price = sc.nextDouble();
        System.out.print("������ͼ��λ�ã�");
        String address = sc.next();

        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setPrice(price);
        book.setAddress(address);

        bookService.addBook(book);
    }

    /**
     * �ж��Ƿ��������
     */
    private boolean flag() {
        Scanner sc = new Scanner(System.in);
       while (true){
           System.out.print("�Ƿ�Ҫ��������[������y/�˳���n]��");
           String flag = sc.next();

           switch (flag) {
               case "y":
                   return false;
               case "n":
                   return true;
               default:
                   System.out.println("�����������������롣");
                   break;
           }
       }
    }
}
