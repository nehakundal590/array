package com.array;
//1-D array marks of student
//Sum of elements in array

public class array3 {
	public static void main(String[] args) {
		int arr[]= {81,34,78,89,31,35};
		int count=0;
		for(int i=0;i<arr.length;i++) {
		count=	count+arr[i];
			/*if(arr[i]<=35) {
				System.out.println(arr[i]+" ");
			}*/
		}
		System.out.println(count);
		
	}

}
