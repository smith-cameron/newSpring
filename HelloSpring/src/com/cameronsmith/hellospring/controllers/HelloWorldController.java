package com.cameronsmith.hellospring.controllers;

import com.cameronsmith.hellospring.models.HelloWorld;

public class HelloWorldController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld h = new HelloWorld();
		System.out.println(h.greet());
	}

}
