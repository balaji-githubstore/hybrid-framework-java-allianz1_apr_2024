package com.allianz.datatypes;

public class Demo2 {

	public static void main(String[] args) {
		
		int[] numbers=new int[5];
		
		numbers[0]=10;
		numbers[1]=20;
//		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);
		
		numbers=new int[6];
		System.out.println(numbers);
		
		
		double[] arr1=new double[3];
		arr1[0]=1.2;
		arr1[1]=10;
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		//create an array to store red,yellow,green. 
		String[] colors=new String[3];
		colors[0]="red";
		colors[2]="green";
		
		System.out.println(colors);
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		
		String[] colors1= {"red","greeen","yellow"};
		System.out.println(colors1[2]);
		
		System.out.println(colors1.length);
		

	}

}
