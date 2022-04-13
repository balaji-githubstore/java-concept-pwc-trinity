package com.pwc.area;
//area
public class Area {

	// declaration and definition
	public static double areaOfCircle(int r) {
		double area = 3.14 * r * r;
		return area;
	}

	public double areaOfTriangle(double base, double height) {
		return (base * height) / 2;
	}
	
	public static String getAuthorName()
	{
		String name="Balaji Dinakaran";
		return name;
	}
	
	public String getClassDescription()
	{
		return "Contains all formulae related to Area";
	}
	
	public void close()
	{
		
	}
	
	public static void quit()
	{
		
	}
}
