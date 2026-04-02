package com.array;

import java.util.Scanner;

public class pallidrome {
public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = sc.nextInt();

int temp = num;  // store original number
int rev = 0;

while (num != 0) {
    int d = num % 10;       
    rev = rev * 10 + d;     
    num = num / 10;         
}

if (temp == rev) {
    System.out.println(temp + " is a Palindrome number.");
} else {
    System.out.println(temp + " is NOT a Palindrome number.");
}
}
}
