package com.itheima.homework;

public class T4 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        //��ʾ:������һ�д���ᵼ�·������׳�����ָ���쳣��,��Ҫ�㲹��һЩ����,ʹ�ó������ִ��

        try {
            int n1 = getMax(null);
        } catch (NullPointerException e) {
            System.out.println("��ָ���쳣");
        }

        //��ʾ:������һ�д���ᵼ�·������׳�������Խ���쳣��,��Ҫ�㲹��һЩ����,ʹ�ó������ִ��
        try {
            int n2 = getMax(arr);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("����Խ���쳣");
        }

        int[] arr2 = {1, 2, 4, 24, 32, 5324, 32};
        int n3 = getMax(arr2);
        System.out.println("��������ִ������...");
    }

    //��ȡ�������ֵ
    public static int getMax(int[] args) {
        int max = 0;

        max = args[0];

        for (int i = 1; i < args.length; i++) {
            if (max < args[i]) {
                max = args[i];
            }
        }

        return max;
    }
}
