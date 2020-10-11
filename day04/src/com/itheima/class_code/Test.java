package com.itheima.class_code;

public class Test {
    public static void main(String[] args) {
        A.C c = new B().new C();
        c.D();
    }
}

class A {
    class C {
        public void D() {
            System.out.println("qwe123");
        }
    }
}

class B extends A {

}

