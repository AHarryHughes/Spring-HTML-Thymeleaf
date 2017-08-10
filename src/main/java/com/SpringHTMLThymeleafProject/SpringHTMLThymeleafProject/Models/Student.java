package com.SpringHTMLThymeleafProject.SpringHTMLThymeleafProject.Models;

/**
 * Created by ahhughes8 on 8/1/17.
 */
public class Student {
    public String firstName;
    public String lastName;
    public Grade grade;

    public Student(String firstName, String lastName, Grade grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
}
