package com.itheima.homework.T5;

public class TheVIP_IdAlreadyExistsExpection extends RuntimeException {
    public TheVIP_IdAlreadyExistsExpection() {
    }

    public TheVIP_IdAlreadyExistsExpection(String message) {
        super(message);
    }
}
