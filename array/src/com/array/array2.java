package com.array;
import java.util.Scanner;
//1-D array

public class array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the element");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Element in the array");
		for(int i=0;i<=n;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println("Printing array");
		for(int i=0;i<=n-1;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
