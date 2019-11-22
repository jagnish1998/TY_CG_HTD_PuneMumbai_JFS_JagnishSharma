package com.capgemini.springcore.annotation.bean;

import com.capgemini.springcore.interfaces.Animal;

public class Panda implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Bamboo....");
	}

	@Override
	public void speak() {
		System.out.println("Panda Squeaks....");
	}

	@Override
	public void walk() {
		System.out.println("Panda is walking.....");
	}

}
