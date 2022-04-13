package com.pwc.basics;

public class VarDemo {
	public static int aS=10; //static variable or class variable
	public static int bS=20;
	
	public int aNS=10;//non-static variable or instance variable 
	public int bNS=20;
	
	
	public static void main(String[] args) {
		
		VarDemo.aS=2000;
		System.out.println(VarDemo.aS);
		
		VarDemo obj1=new VarDemo(); //allocate memory for all non-static variable
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		VarDemo obj2=new VarDemo();
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
		obj1.bNS=50;
		
	}

}
	