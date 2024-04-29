package com.allianz.datatypes;

public class Demo1 {
	
	public static void main(String[] args) {
		
		byte a=100;  //8 bits
		short b=100;  //16 bits
		int c=100;  //32 bits
		long d=100L; //64 bits
		
		//byte --> 1000*8=8000 bits of memory
		//int -->1000*32=320000 bits of memory
		
		float e=1.123456789f; //32 bit
		double f=1.123456789; //64 bit
		
		boolean check=true;
		char letter='b';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(e);
		System.out.println(f);
		System.out.println(letter);
		System.out.println(check);
		
		System.out.println("The output is "+e);
		
		String myName="Bala"; //4*16 bits
		
		System.out.println(myName);
		
		System.out.println(myName.toUpperCase());
		System.out.println(myName.charAt(1));
		
		System.out.println(myName.length());
		
		
	}

}
