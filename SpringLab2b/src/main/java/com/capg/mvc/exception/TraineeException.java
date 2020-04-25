package com.capg.mvc.exception;

public class TraineeException extends RuntimeException {

    public TraineeException(String msg) {
        super(msg);
        System.err.println(msg);
    }

}