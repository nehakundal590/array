package com.neha;
class B{
	int a=10;
	int b=20;
	


	void m1() {
		System.out.println("m1 inside the B");
	}
	
		
 public String toString()	{
	 return "A[ a ="+a+ ",b ="+b+"]";
		
	}
	
	}


public class to_String {
	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.toString());
	}

}
