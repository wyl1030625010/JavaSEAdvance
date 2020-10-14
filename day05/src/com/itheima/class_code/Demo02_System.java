package com.itheima.class_code;

import java.util.Arrays;

public class Demo02_System {
    public static void main(String[] args) {

        int[] arr2 = new int[10];

        //一毫秒的形式输出当前系统时间
        long l = System.currentTimeMillis();
        System.out.println(l);

        //数组拷贝 arrycopy(被拷贝的数组，从第几个索引开始拷贝，粘贴到哪个数组，从第几个索引开始粘贴，粘贴多少个数)
        System.arraycopy(new int[]{1, 2, 3, 4, 5, 6}, 0, arr2, 1, 6);

        System.out.println(Arrays.toString(arr2));

        //关闭进程 status：当输入非零时，异常关闭
        System.exit(0);
    }
}
