package com.pwc.datatypes;

public class DatatypesDemo2Array {
	
	public static void main(String[] args) {
		
		int[] numbers=new int[2];//memory for 2 integer is allocated
		numbers[0]=45;
		numbers[1]=56;
		
		System.out.println(numbers);
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		double[] arr=new double[2];
		arr[0]=78.2;
		arr[1]=777;
		
		String[] windows=new String[3];
		windows[0]="red";
		windows[1]="green";
		windows[2]="yellow";
	
		System.out.println(windows[0]);
		String[] colors= {"red","yellow","orange"};
				
		
		String[][] main={{"john","john123"},{"peter","peter123"},{"paul","paul123"}};
		
		System.out.println(main[0][1]);
	}
}







