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
     * @param o ��ʾ�����е�Ԫ��
     * @return 0 ��ʾ��� �����
     * <0 �Ƚ�С ������
     * >0 �Ƚϴ� ����ұ�
     */
    @Override
    public int compareTo(Student o) {
        //��Ҫ����
        //���������������
        int recult = this.age - o.age;

        //��Ҫ����
        //���������������ʱ������ASCII����������ĸ��ʼ���ж������е���ĸ����ĸ��ǰ������ߣ���������ұ�
        recult = recult == 0 ? this.name.compareTo(o.name) : recult;

        return recult;
    }
}
