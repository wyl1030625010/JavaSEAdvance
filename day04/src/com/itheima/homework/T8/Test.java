package com.itheima.homework.T8;

/**
 * (1)����:
 * a.����:����,���
 * (2)��������:
 * a.����:����,���
 * b.��Ϊ:��Ǯ(������ģ��),���(��Ů����һ����,����Ů������)
 * <p>
 * (3)Ů������:
 * a.����:����,���
 * b.��Ϊ:����,ϴ�·�(ϴĳһ���·�,���·�����Ϊ�β�)
 * <p>
 * (4)�·���:
 * a.����:Ʒ��,��ɫ
 * <p>
 * (5)������:
 * a.����Ů���Ѷ���,Ϊ����,��߸�ֵ,����������ϴ�·�����
 * <p>
 * b.���������Ѷ���,Ϊ����,��߸�ֵ,������Ǯ�͹�ַ���
 */
public class Test {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend("����", 156);
        girlFriend.cook();
        girlFriend.washClothes(new Clothe("����֮��", "��ɫ"));

        BoyFriend boyFriend = new BoyFriend("����", 180);
        boyFriend.makeMoney();
        boyFriend.shopping(girlFriend);
    }
}
