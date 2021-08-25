package com.demo.controller;

import com.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeControllerWithRequestBody {

    // 4 operation will operate:- add ,get_all , update  ,delete

    // first we will make employee list

   /* // syntax of list: Arraylist Object_Name = new Arraylist (); //without datatype
    //only one variable(Object_Name) in which we can store multiple data or group of data

    */

    // GENERICS: TELLS THE DATATYPE(int,string,double) OF COLLECTION
    //Syntax of Generics: //ArrayList <DataType> Object_Name =new ArrayList <DataType>();

    ArrayList<Employee> employeeArrayList = new ArrayList<>();

   /* // here our list (employeeArrayList) is ready and this list will be used in all 4 operation
    // all data will store in this list (employeeArrayList)

    */
    //ADD END POINT
    //syntax of signature method: access_specifier return_type function or method name(optional parameter){code} -------of core java
    //value="/all" ,method= RequestMethod.GET
    @RequestMapping(value="/add_emp_new" ,method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employee){


        employeeArrayList.add(employee);
        return  "Employee Added Successfully";

    }

    // get_all ----contains list and all data will store in this list here our list is employeeArrayList
    // if we will return to this list then we can find all employee list

    //syntax of signature method: access_specifier return_type function or method name(){} -------of core java

    // get_all END POINT
    @RequestMapping(value="/get_all_emp_new",method = RequestMethod.GET)

    public ArrayList<Employee> getEmployeeArrayList (){


        return employeeArrayList;
    }


    // update END POINT

    //syntax of signature method: access_specifier return_type function or method name(){} -------of core java

    @RequestMapping(value = "/update_emp_new" ,method = RequestMethod.PUT)

    public String updateEmployee(){

        Employee employee1 =  employeeArrayList.get(0);
        employee1.setName("JAVA"); // setter method to update name

        return  employeeArrayList.get(0) .getName() +"Record updated Successfully";
    }

    // delete END POINT
    @RequestMapping(value = "/delete_emp_new" , method = RequestMethod.DELETE)
    public String deleteEmployee(){

        employeeArrayList.remove(0);

        return "Employee deleted successfully";
    }












}
