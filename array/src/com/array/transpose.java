package com.array;

import java.util.Scanner;

public class transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int row=sc.nextInt();
		
		System.out.println("Enter Columns");
		int column=sc.nextInt();
		int matrix[][]=new int [row ][ column];
		int transpose[][]=new int[column] [row];
		
		System.out.println("Enter elements");
		for(int i=0;i<row ;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				transpose[j][i]=matrix[i][j];
			}
			
		}
		System.out.println("Transpose matrix");
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(transpose[i][j]+" ");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
