package com.example.exceptions;

public class EmptyStudentListException extends RuntimeException{
    public EmptyStudentListException(String message){
        super(message);
    }
}
