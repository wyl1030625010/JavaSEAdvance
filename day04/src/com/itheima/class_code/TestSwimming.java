package com.itheima.class_code;

public class TestSwimming {
    public static void main(String[] args) {

        //�����ڲ��ഴ������������������Ϊ��ʵ��
        goSwimming(new Swim() {
            @Override
            public void swimming() {
                System.out.println("��Ӿ");
            }
        });

        //�������ȼ����������
        /*
        ������Swim��������౾��û������
        ������󱻱��浽����s��
        goSwimming()����s
         */
        Swim s = new Swim() {

            @Override
            public void swimming() {
                System.out.println("��ȥ��Ӿ");
            }
        };
        goSwimming(s);
    }

    public static void goSwimming(Swim swim) {
        swim.swimming();
    }
}

interface Swim {
    void swimming();
}


