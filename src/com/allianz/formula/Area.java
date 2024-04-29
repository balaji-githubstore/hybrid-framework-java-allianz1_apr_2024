package com.allianz.formula;

public class Area {
	
	public static double areaOfCircle(double r) {
		double area = 3.14 * r * r;
		return area;
	}
	
	public static double areaOfRectangle(double length,double width) 
	{
		return length*width;
	}
	
	public double areaOfTriangle(double base,double height)
	{
		return (base*height)/2;
	}
	
	public String getAuthorName()
	{
		return "Balaji Dinakaran";
	}
	
	public static void quit()
	{
		
	}
	

}




