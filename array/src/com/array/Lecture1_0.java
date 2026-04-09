package com.array;

public class Lecture1_0 {
	public static void updates(int marks[]) {
		for(int i=0;i<=marks.length;i++) {
			marks[i]=marks[i]+1;
		}
	}
	public static void main(String[] args) {
		int marks[]= {97,98,99};
		updates(marks);
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]+"");
		}
		System.out.println();
		
	}

}
