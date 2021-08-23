package com.demo.controller;

import com.demo.model.Employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoEmployeeController {

   // 4 operation will operate:- add ,get_all , update  ,delete

   // first we will make employee list

   /* // syntax of list: Arraylist Object_Name = new Arraylist (); //without datatype
    //only one variable(Object_Name) in which we can store multiple data or group of data

    */

    // GENERICS: TELLS THE DATATYPE(int,string,double) OF COLLECTION
    //Syntax of Generics: //ArrayList <DataType> Object_Name =new ArrayList <DataType>();

    ArrayList <Employee> employeeArrayList = new ArrayList<>();

   /* // here our list (employeeArrayList) is ready and this list will be used in all 4 operation
    // all data will store in this list (employeeArrayList)

    */
    //ADD END POINT
    //syntax of signature method: access_specifier return_type function or method name(){} -------of core java

     @RequestMapping ("/add_emp")
      public String addEmployee(){

         //  to create an object of an Employee through parameterized constructor because object is not available here

         Employee employee = new Employee( "John", 25 ,"IT");

         // now we add  Object_Name(employeeArrayList) of Generics in this object Employee  employee = new Employee( "John", 25 ,"IT");


         employeeArrayList.add(employee);
          return  "Employee Added Successfully";

      }

      // get_all ----contains list and all data will store in this list here our list is employeeArrayList
     // if we will return to this list then we can find all employee list

     //syntax of signature method: access_specifier return_type function or method name(){} -------of core java

    // get_all END POINT
    @RequestMapping("/get_all_emp")

   public ArrayList<Employee> getEmployeeArrayList (){


         return employeeArrayList;
   }


   // update END POINT

    //syntax of signature method: access_specifier return_type function or method name(){} -------of core java

    @RequestMapping("/update_emp")
    public String updateEmployee(){

     Employee employee1 =  employeeArrayList.get(0);
     employee1.setName("JAVA"); // setter method to update name

         return  employeeArrayList.get(0) .getName() +"Record updated Successfully";
    }

   // delete END POINT
    @RequestMapping("/delete_emp")
    public String deleteEmployee(){

        employeeArrayList.remove(0);

         return "Employee deleted successfully";
    }




}

// note: first we will hit /add_emp on Google_chrome -----localhost:8081/add_emp
// after this  we will hit /get_all_emp on Google_chrome -----localhost:8081/get_all_emp
// if we will repeat this then we will find out repeated value

// first we will hit /add_emp on Google_chrome -----localhost:8081/add_emp ----Employee Added Successfully
//after this  we will hit /get_all_emp on Google_chrome -----localhost:8081/get_all_emp----{"name":"John","age":25,"dept":"IT"}

// again first we will hit /add_emp on Google_chrome -----localhost:8081/add_emp ----Employee Added Successfully
// again after this  we will hit /get_all_emp on Google_chrome -----localhost:8081/get_all_emp---{"name":"John","age":25,"dept":"IT"},
 //{"name":"John","age":25,"dept":"IT"}
// it means get_all END POINT is working properly.
// 1 time hit---1 record
// 2 time hit---2 record and so on..