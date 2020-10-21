package com.itheima.homework.T5;

import java.util.ArrayList;

/**
 * 会员注册:会员信息包括(会员号，姓名，电话，身份证号),其中会员号和身份证号不能重复。
 */
public class VIP implements Comparable<VIP> {
    private Integer id;
    private String name;
    private String phone;
    private String idCard;

    private static ArrayList<Integer> idList = new ArrayList<>();
    private static ArrayList<String> idcardList = new ArrayList<>();

    @Override
    public String toString() {
        return "VIP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", idCard=" + idCard +
                '}';
    }

    public VIP() {
    }

    public VIP(Integer id, String name, String phone, String idCard) {
        checkId(id);
        this.name = name;
        this.phone = phone;
        checkIdcard(idCard);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        checkId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        checkIdcard(idCard);
    }

    public void checkIdcard(String idcard) {
        for (String id : idcardList) {
            if (idcard.equals(id) || idcard.isEmpty()) {
                throw new TheIdcardNumberAlreadyExistsExpection();
            }
        }

        idcardList.add(idcard);
        this.idCard = idcard;
    }

    public void checkId(int id) {
        for (Integer integer : idList) {
            if (id == integer) {
                throw new TheVIP_IdAlreadyExistsExpection();
            }
        }

        idList.add(id);
        this.id = id;
    }

    @Override
    public int compareTo(VIP o) {
        int recult = this.id - o.getId();
        Add add = new Add();

//        if (0 == recult && add.show().size() != 0) {
//            throw new TheVIP_IdAlreadyExistsExpection("该会员id已存在");
//        }
//
//        int checkIdcard = this.idCard.compareTo(o.getIdCard());
//        if (0 == checkIdcard && add.show().size() != 0) {
//            throw new TheIdcardNumberAlreadyExistsExpection("该身份证号码已存在");
//        }

        return recult;
    }
}
