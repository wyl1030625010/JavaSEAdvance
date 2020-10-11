package com.itheima.homework.T8;

/**
 * (1)人类:
 * a.属性:姓名,身高
 * (2)男朋友类:
 * a.属性:姓名,身高
 * b.行为:挣钱(输出语句模拟),逛街(和女朋友一块逛街,用上女朋友类)
 * <p>
 * (3)女朋友类:
 * a.属性:姓名,身高
 * b.行为:做饭,洗衣服(洗某一件衣服,用衣服类作为形参)
 * <p>
 * (4)衣服类:
 * a.属性:品牌,颜色
 * <p>
 * (5)测试类:
 * a.创建女朋友对象,为姓名,身高赋值,调用做饭和洗衣服方法
 * <p>
 * b.创建男朋友对象,为姓名,身高赋值,调用挣钱和逛街方法
 */
public class Test {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend("张三", 156);
        girlFriend.cook();
        girlFriend.washClothes(new Clothe("海澜之家", "蓝色"));

        BoyFriend boyFriend = new BoyFriend("李四", 180);
        boyFriend.makeMoney();
        boyFriend.shopping(girlFriend);
    }
}
