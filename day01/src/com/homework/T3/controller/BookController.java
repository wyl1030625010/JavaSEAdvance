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
            System.out.println("-------欢迎来到图书管理系统-------");
            System.out.println("请输入先择：1.增加图书 2.删除图书 3.修改图书 4.查看图书 5.退出系统");
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
                    System.out.println("感谢您的使用");
                    return;
                default:
                    System.out.println("输入有误");

            }
        }
    }

    /**
     * 根据id修改图书
     */
    private void editBookById() {
        String id;
        Scanner sc = new Scanner(System.in);

        System.out.println("修改图书...");

        while (true) {
            System.out.print("请输入图书id：");
            id = sc.next();
            boolean byId = bookService.findById(id);
            if (byId) {
                break;
            } else {
                System.out.println("id *" + id + "* 不存在，请重新输入。");
                if (flag()) {
                    System.out.println();
                    return;
                }
            }
        }

        System.out.print("请输入新图书名称：");
        String newName = sc.next();
        System.out.print("请输入新图书价格：");
        Double newPrace = sc.nextDouble();
        System.out.print("请输入新图书地址：");
        String newAddress = sc.next();

        Book newBook = new Book(id, newName, newPrace, newAddress);

        bookService.editBookById(id, newBook);
    }

    /**
     * 根据id删除图书
     */
    private void delBookById() {
        String id;

        Scanner sc = new Scanner(System.in);
        System.out.println("删除图书...");

        while (true) {
            System.out.print("请输入图书id：");
            id = sc.next();
            boolean byId = bookService.findById(id);
            if (byId) {
                break;
            } else {
                System.out.println("id *" + id + "* 不存在，请重新输入。");
                if (flag()) {
                    System.out.println();
                    return;
                }
            }
        }

        bookService.delBookById(id);
    }


    /**
     * 查询所有图书操作
     */
    private void findAllBook() {
        System.out.println("查看图书...");
        ArrayList<Book> allBook = bookService.findAllBook();
        System.out.println("编号\t名称\t价格\t位置");
        for (int i = 0; i < allBook.size(); i++) {
            Book book = allBook.get(i);
            System.out.println(book.getId() + "\t" + book.getName() + "\t" + book.getPrice() + "\t" + book.getAddress());
        }
        System.out.println();
    }


    /**
     * 添加图书操作
     */
    private void addBook() {
        String id;
        Scanner sc = new Scanner(System.in);
        System.out.println("增加图书...");

        while (true) {
            System.out.print("请输入图书id：");
            id = sc.next();
            boolean byId = bookService.findById(id);
            if (byId) {
                System.out.println("id *" + id + "* 已存在，请重新输入。");
                if (flag()) {
                    System.out.println();
                    return;
                }
            } else {
                break;
            }
        }

        System.out.print("请输入图书名称：");
        String name = sc.next();
        System.out.print("请输入图书价格：");
        Double price = sc.nextDouble();
        System.out.print("请输入图书位置：");
        String address = sc.next();

        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setPrice(price);
        book.setAddress(address);

        bookService.addBook(book);
    }

    /**
     * 判断是否继续输入
     */
    private boolean flag() {
        Scanner sc = new Scanner(System.in);
       while (true){
           System.out.print("是否还要继续输入[继续：y/退出：n]：");
           String flag = sc.next();

           switch (flag) {
               case "y":
                   return false;
               case "n":
                   return true;
               default:
                   System.out.println("输入有误，请重新输入。");
                   break;
           }
       }
    }
}
