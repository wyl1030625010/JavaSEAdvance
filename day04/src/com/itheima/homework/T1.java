package com.itheima.homework;

public class T1 {
    public static void main(String[] args) {
        Outside1.Inside inside = new Outside1().new Inside();
        inside.show();
    }
}

class Outside1 {
    private int a = 100;

    class Inside {
        private int a = 200;

        public void show() {
            int a = 300;
            System.out.println(Outside1.this.a);//100
            System.out.println(Inside.this.a);//200
            System.out.println(a);//300
        }
    }
}
