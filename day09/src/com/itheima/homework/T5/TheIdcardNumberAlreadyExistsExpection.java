package com.itheima.homework.T5;

public class TheIdcardNumberAlreadyExistsExpection extends RuntimeException {
    public TheIdcardNumberAlreadyExistsExpection() {
    }

    public TheIdcardNumberAlreadyExistsExpection(String message) {
        super(message);
    }
}
