package com.itheima.class_code.Demo02_DesignPattern;

public abstract class CompositionTemptation {
    /**
     * ��������ģ��
     * ģ�巽��һ�㲻�����׸Ķ�
     * final���ε��಻�ܱ�����̳�
     */
    public final void writ() {
        System.out.println("��������Ŀ��");

        body();

        System.out.println("���Ľֽ�β");
    }


    /**
     * ���󷽷�������������
     */
    public abstract void body();
}
