package com.itheima.class_code.Demo08_Throw;

public class AgeOutOfBoundExpection extends RuntimeException {
    public AgeOutOfBoundExpection() {
    }

    public AgeOutOfBoundExpection(String message) {
        super(message);
    }
}
