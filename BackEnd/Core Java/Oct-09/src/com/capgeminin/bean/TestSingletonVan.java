package com.capgeminin.bean;

public class TestSingletonVan {
	public static void main(String[] args) {
		VanSingleton v1  = VanSingleton.getVanSingleton();
		VanSingleton v2  = VanSingleton.getVanSingleton();
		VanSingleton v3  = VanSingleton.getVanSingleton();
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}
}
