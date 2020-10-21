package com.itheima.class_code;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @param o 表示集合中的元素
     * @return 0 表示相等 不添加
     * <0 比较小 添加左边
     * >0 比较大 添加右边
     */
    @Override
    public int compareTo(Student o) {
        //首要条件
        //根据年龄进行排序
        int recult = this.age - o.age;

        //次要条件
        //当集合中年龄相等时，根据ASCII码依从首字母开始次判断姓名中的字母，字母靠前的排左边，靠后的排右边
        recult = recult == 0 ? this.name.compareTo(o.name) : recult;

        return recult;
    }
}
