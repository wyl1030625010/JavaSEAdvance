package com.itheima.test;

public class Test {
    public static void main(String[] args) {
        test(new Zi2());
    }

    public static void test(Fu fu) {
        Zi1 z1 = (Zi1) fu;
    }
}

class Fu {

}

class Zi1 extends Fu {

}

class Zi2 extends Fu {

}