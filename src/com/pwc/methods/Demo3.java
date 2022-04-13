package com.pwc.methods;

import com.pwc.area.Area;

public class Demo3 {

	public static void main(String[] args) {

		int radius = 10;

		// calling the method
		double res = Area.areaOfCircle(10);
		System.out.println(res);

		res = Area.areaOfCircle(20);
		System.out.println(res);

		Area area1=new Area();
		
		double res1 = area1.areaOfTriangle(12.5, 12.5);
		System.out.println(res1);
		
		String output=Area.getAuthorName();
	    System.out.println(output);
	    
	  String desc=area1.getClassDescription();
	  System.out.println(desc);
	  
	  Area.quit();
	  
	  area1.close();
	}

}
