package com.capgemini.array.concept;

interface Wgm
{
	String gm();
}
public class LamdaExpessionGM 
{
	public static void main(String[] args) {
		Wgm g = ()->"Good Morning";
		System.out.println(g.gm());
	}
}
