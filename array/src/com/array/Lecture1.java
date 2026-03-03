package com.array;

import java.util.Scanner;

public class Lecture1 {
	public static void main(String[] args) {
		int marks[]=new int[5];
		System.out.println("length of array"+marks.length);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter yours marks");
		marks[0]=sc.nextInt();
		marks[1]=sc.nextInt();
		marks[2]=sc.nextInt();
		System.out.println("physics:"+marks[0]);
		System.out.println("chemistry:"+marks[1]);
		System.out.println("maths:"+marks[2]);
		 marks[2]=marks[2]+1;
		 System.out.println("maths"+marks[2]);
		 
		 int percentag=(marks[0]+marks[1]+marks[2])/3;
		 System.out.println("percentage"+percentag+"%");
	}

}
