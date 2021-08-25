package com.demo.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name="Student_Table_Java")
public class Student {


     @Id   // primary key unique value
     @GeneratedValue  // automatically increases of value


    //properties/attribute of Student: name,age ,roll_no
    // declaration of properties

    String name;
    int age;
    int  roll_no;

    // default constructor
    public Student (){

    }

    // parameterized constructor
    public Student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }


    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }




}
