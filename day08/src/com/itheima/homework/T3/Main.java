package com.itheima.homework.T3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 请定义方法找出集合中所有姓张的人并且年龄大于18岁的并全部返回,然后在main方法中输出返回的人;
 * 集合原始数据有: 张三,22   李四,26    张翠山,38    赵六,19    张三丰,103    张无忌,17    赵敏,16
 * <p>
 * **要求:**
 * <p>
 * 集合中的人需要以对象的形式存在,人只要有姓名和年龄两个成员变量即可;
 */
public class Main {
    public static void main(String[] args) {
        Collection<Person> collection = new ArrayList<>();
        collection.add(new Person("张三", 22));
        collection.add(new Person("李四", 26));
        collection.add(new Person("张翠山", 38));
        collection.add(new Person("赵六", 19));
        collection.add(new Person("张三丰", 103));
        collection.add(new Person("张无忌", 17));
        collection.add(new Person("赵敏", 16));

        Collection<Person> recult = check(collection);

        for (Person person : recult) {
            System.out.println(person);
        }
    }

    private static Collection<Person> check(Collection<Person> collection) {
        Collection<Person> recult = new ArrayList<>();
        for (Person person : collection) {
            if (person.getName().contains("张") && person.getAge() > 18) {
                recult.add(person);
            }
        }
        return recult;
    }
}
