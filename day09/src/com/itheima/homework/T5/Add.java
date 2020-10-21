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
                System.out.println("------" + "��" + (count + 1) + "����Ա" + "-------");
                System.out.print("�������Ա�ţ�");
                Integer id = sc.nextInt();
                try {
                    vip.setId(id);
                } catch (TheVIP_IdAlreadyExistsExpection e) {
                    System.out.println("��Աid" + id + "�Ѵ�������������");
                    continue;
                }
                System.out.print("������������");
                String name = sc.next();
                vip.setName(name);
                System.out.print("������绰��");
                String phone = sc.next();
                vip.setPhone(phone);

                while (true) {
                    String idcard = null;
                    try {
                        System.out.print("���������֤�ţ�");
                        idcard = sc.next();
                        vip.setIdCard(idcard);
                        break;
                    } catch (TheIdcardNumberAlreadyExistsExpection e) {
                        System.out.println("���֤���Ѵ�������������");
                    }
                }

                ts.add(vip);
              /*  try {
                    ts.add(new VIP(id, name, phone, idcard));
                } catch (TheVIP_IdAlreadyExistsExpection e) {
                    System.out.println("��Աid" + id + "�Ѵ�������������");
                    continue;
                } catch (TheIdcardNumberAlreadyExistsExpection ex) {
                    System.out.println("���֤��" + idcard + "�Ѵ�������������");
                    continue;
                }*/
            } catch (InputMismatchException e) {
                System.out.println("�������");
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
