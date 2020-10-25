package com.itheima.class_code;

import java.util.Objects;

public class Actor {
    private String name;

    @Override
    public String toString() {
        return "Actore{" +
                "name='" + name + '\'' +
                '}';
    }

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Actor actore = (Actor) o;
        return Objects.equals(name, actore.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
