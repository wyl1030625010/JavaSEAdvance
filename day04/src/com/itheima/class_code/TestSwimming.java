package com.itheima.class_code;

public class TestSwimming {
    public static void main(String[] args) {

        //匿名内部类创建出来的匿名对象作为了实参
        goSwimming(new Swim() {
            @Override
            public void swimming() {
                System.out.println("游泳");
            }
        });

        //上面代码等价于下面代码
        /*
        父类是Swim，但这个类本身没有名字
        这个对象被保存到变量s中
        goSwimming()调用s
         */
        Swim s = new Swim() {

            @Override
            public void swimming() {
                System.out.println("又去游泳");
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


