package com.demo.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController1 {

    //END POINT 1
    //Addition:
    //Syntax of signature method: access_specifier return_type function or methodName(optional parameter){}
    //Path Variable
    //http://localhost:8081/addition/20/10 it is used to run program by using Path_variable on Google _chrome url
    // for finding dynamically values of calculator, here 20 and 10 are the value of a and b.
    //REQUEST PARAM
    //http://localhost:8081/addition?a=20&b=10 ------for two input parameters
    //http://localhost:8081/hello?msg="java"---------for single input parameter-------"any value can give where java has written"


    @RequestMapping("/addition/{a}/{b}")
    public int addwithPathVariable(@PathVariable int a, @PathVariable int b) {

        int sum = a + b;
        return sum;

    }

    //END POINT 2
    //Division:
    //Syntax of signature method: access_specifier return_type function or methodName(optional parameter){}

    @RequestMapping("/division/{a}/{b}")
    public int divwithPathVariable(@PathVariable int a, @PathVariable int b) {
        int div = a / b;
        return div;

    }

    //END POINT 3
    //Multiplication:

    @RequestMapping("/multiplication/{a}/{b}")
    public int multiwithPathVariable(@PathVariable int a, @PathVariable int b) {
        int multi = a * b;
        return multi;

    }


    //END POINT 4
    //Subtraction:

    @RequestMapping("/subtraction/{a}/{b}")
    public int subwithPathVariable(@PathVariable int a, @PathVariable int b) {
        int sub = a - b;
        return sub;


    }

    //FOR SINGLE INPUT PARAMETER
    @RequestMapping("/hello/{msg}")
    public String messagewithPathVariable(@PathVariable String msg) {

        return "welcome" + msg;
    }


    //REQUEST PARAM
    //END POINT 1
    @RequestMapping("/add")

    public int addwithRequestParam(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return sum;


    }

    //END POINT 2
    @RequestMapping("/multi")

    public int multiwithRequestParam(@RequestParam int a,@RequestParam int b) {
        int multi = a * b;
        return multi;
    }



    //END POINT 3
    @RequestMapping("/div")

    public int divwithRequestParam(@RequestParam int a,@RequestParam int b) {
        int div = a / b;
        return div;
    }

    //END POINT 4
    @RequestMapping("/sub")

    public int subwithRequestParam(@RequestParam int a,@RequestParam int b) {
        int sub = a-b;
        return sub;
    }


    //FOR SINGLE INPUT PARAMETER
    @RequestMapping("/hello")
    public String messagewithRequestParam(@RequestParam String msg){

        return "welcome"+msg;
    }



}