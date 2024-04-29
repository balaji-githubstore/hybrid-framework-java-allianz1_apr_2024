package com.allianz.methods;

import com.allianz.formula.Area;

public class Demo1Methods {


	public static void main(String[] args) {

		int radius = 10;
		
		Area obj=new Area();
		
		double result = Area.areaOfCircle(5);
		System.out.println(result);

		result = Area.areaOfCircle(20.2);
		System.out.println(result);
		
		System.out.println(Area.areaOfCircle(30));
		
		double result1= Area.areaOfRectangle(10, 10.2);
		System.out.println(result);
		
		result1=obj.areaOfTriangle(25, 1);
		System.out.println(result1);
		
		String myName=obj.getAuthorName();
		System.out.println(myName);
		
		Area.quit();
		
		System.out.println(obj.areaOfTriangle(10, 10));
		
		System.out.println(Math.PI);
		
		double output= Math.sqrt(64);
		System.out.println(output);
	}

}
