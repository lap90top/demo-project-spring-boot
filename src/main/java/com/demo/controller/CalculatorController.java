package com.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

     // Controller made through @RestController ,and it will write above class (public class CalculatorController).
    // END POINT MADE THROUGH @RequestMapping ,and it will write above signature method (public int add).
    // @RequestMapping ("/here we will put url which we want to run on Google_chrome such as /addition,/multiplication,/division")

    //Calculator :  addition, multiplication,division,subtraction
    //add=a+b,multi=a*b, div=a/b,sub=a-b

    //Syntax of signature method: access_specifier return_type function or methodName(optional parameter){}-------
    // this syntax is used for core java
    // note: this method of calculator is used for hard coded values such as  int a=45,int b=43


    //END POINT 1
    //Addition:


    @RequestMapping("/addition")
    public int add(){
        int a=45;
        int b=43;
        int sum=a+b;

        System.out.println("SUM of a and b is:" +sum);
        return sum;
    }

    //END POINT2
    //Multiplication:

    @RequestMapping("/multiplication")
    public int multi() {
        int a = 7;
        int b = 4;
        int multi = a * b;
        System.out.println("MULTI of a and b is:" + multi);

        return multi;
    }

    //END POINT3
    //Division:
    @RequestMapping("/division")
    public int div() {

        int a = 25;
        int b = 5;
        int div = a / b;
        System.out.println("DIVof a and b is:" + div);

        return div;

    }

    //END POINT 4
    //Subtraction:
    @RequestMapping("/subtraction")
    public int sub() {

        int a = 20;
        int b = 10;
        int sub = a - b;
        System.out.println("SUB of a and b is:" + sub);

        return sub;


    }




}
