package com.neha;
//parent class method not satisfied used method overridingw
class object{
	public String toString() {
		return "Prasoon Bidua";
	}
}
class A extends object{
	
	int a=10;
	
	
	void m1() {
		System.out.println("m1 inside the class A");
	}
}

public class Demo {
	public static void main(String[] args) {
		A a1=new A();
		//System.out.println(a1);
		System.out.println(a1.toString());
	}

}
