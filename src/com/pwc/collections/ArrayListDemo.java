package com.pwc.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList<String> colors=new ArrayList<String>();
		List<String> colors=new ArrayList<String>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("yellow");
		colors.add("black");
		colors.add("red");
		colors.remove("blue");
		
		System.out.println(colors);
		System.out.println(colors.get(0));
		
		System.out.println(colors.get(2));
	}
}
