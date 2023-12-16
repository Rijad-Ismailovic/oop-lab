package com.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        StudentSystem studentSystem = new StudentSystem("C:/Users/rijad/OneDrive/Desktop/Folders/Programming/school/oop/week11/main/src/main/resources/students.csv");
        /*for(Student student : studentSystem.getStudents()){
            student.displayInfo();
        }*/

        System.out.println(studentSystem.getStudentById(10));
        studentSystem.getHighestGPAStudent().displayInfo();
        studentSystem.getLongestNameStudent().displayInfo();    
    }
}
