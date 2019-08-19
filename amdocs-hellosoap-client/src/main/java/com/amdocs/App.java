package com.amdocs;

import org.amdocs.Hello;
import org.amdocs.HelloService;

public class App {

	public static void main(String[] args) {
		
		HelloService service = new HelloService();
		Hello hello = service.getHello();
		
		System.out.println(hello.sayHello());

	}

}
