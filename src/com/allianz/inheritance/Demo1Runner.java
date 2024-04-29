package com.allianz.inheritance;

class Father
{
	public int fAge=60;
	
	public Father(int a)
	{
		System.out.println("father cons");
		fAge=a;
	}
	
	public void fStyle()
	{
		System.out.println("father style");
	}
	
	public void skill()
	{
		System.out.println("father skill");
	}
}

class Son extends Father
{
	public int sAge=20;
	public Son(int f,int s)
	{
		super(f);
		System.out.println("son cons");
		sAge=s;
	}
	
	public void sStyle()
	{
		super.fStyle();
		System.out.println("Son Style");
	}
	
	public void skill()
	{
		System.out.println("son skill");
	}
}

public class Demo1Runner {

	public static void main(String[] args) {
		
//		Son son=new Son(65,25);
//		System.out.println(son.fAge);
//		System.out.println(son.sAge);
//
//		son.fStyle();
//		son.sStyle();
//		son.skill();
		
		Father f=new Son(65, 20);
		System.out.println(f.fAge);
		f.fStyle();
		f.skill();

	}

}
