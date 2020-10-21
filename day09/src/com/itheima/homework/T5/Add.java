package com.itheima.homework.T5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class Add {
    public static TreeSet<VIP> ts = new TreeSet<>();

    public void start() {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (count < 3) {
            VIP vip = new VIP();
            try {
                System.out.println("------" + "第" + (count + 1) + "个会员" + "-------");
                System.out.print("请输入会员号：");
                Integer id = sc.nextInt();
                try {
                    vip.setId(id);
                } catch (TheVIP_IdAlreadyExistsExpection e) {
                    System.out.println("会员id" + id + "已存在请重新输入");
                    continue;
                }
                System.out.print("请输入姓名：");
                String name = sc.next();
                vip.setName(name);
                System.out.print("请输入电话：");
                String phone = sc.next();
                vip.setPhone(phone);

                while (true) {
                    String idcard = null;
                    try {
                        System.out.print("请输入身份证号：");
                        idcard = sc.next();
                        vip.setIdCard(idcard);
                        break;
                    } catch (TheIdcardNumberAlreadyExistsExpection e) {
                        System.out.println("身份证号已存在请重新输入");
                    }
                }

                ts.add(vip);
              /*  try {
                    ts.add(new VIP(id, name, phone, idcard));
                } catch (TheVIP_IdAlreadyExistsExpection e) {
                    System.out.println("会员id" + id + "已存在请重新输入");
                    continue;
                } catch (TheIdcardNumberAlreadyExistsExpection ex) {
                    System.out.println("身份证号" + idcard + "已存在请重新输入");
                    continue;
                }*/
            } catch (InputMismatchException e) {
                System.out.println("输入错误");
                continue;
            }

            count++;
        }

        System.out.println(show());
    }

    public TreeSet<VIP> show() {
        return ts;
    }
}
