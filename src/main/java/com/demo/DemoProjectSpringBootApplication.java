package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoProjectSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectSpringBootApplication.class, args);
	}

	@RestController

	public static class DemoController {

		//syntax of signature method: // access_specifier  return_type  function or methodName(optional parameters){}

		//END POINT1
		@RequestMapping("/welcome")
		public void Hello() {

			System.out.println("Hello,Welcome to Spring Boot....");
		}

		//END POINT2
		@RequestMapping("/welcome_screen")
		public String hello_screen() {

			return "Hello,Welcome to Spring Boot....";
		}


		//END POINT3
		@RequestMapping("/age")
		public int age() {

			return 33;
		}

		//END POINT4
		@RequestMapping("/price")
		public double price() {

			return 50.50;
		}

		//END POINT5
		// syntax of signature method:
		//access_specifier return_type methodName(){}

		@RequestMapping("/names")
		public List<String> listNames() {

			//Syntax of Generics:
			// ArrayList <DataType> Object_Name =new ArrayList <DataType>();
			ArrayList<String> name = new ArrayList<>();
			name.add("Akash");
			name.add("Preeti");
			name.add("Avi");
			name.add("Ajay");

			return name;

		}



	}


}



