package com.itheima.homework.T5;

public class Grade implements Comparable<Grade> {
    private Integer id;
    private String gradeName;

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gradeName='" + gradeName + '\'' +
                '}';
    }

    public Grade() {
    }

    public Grade(Integer id, String gradeName) {
        this.id = id;
        this.gradeName = gradeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    @Override
    public int compareTo(Grade o) {
        return this.getId() - o.getId();
    }
}
