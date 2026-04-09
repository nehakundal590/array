package array_2D;

import java.util.Scanner;

public class FirstUnique {
	public char firstUniqueChar(String s) {
		int[]count=new int[26];
		for (char c:s.toCharArray()) {
			count[c-'a']++;
		}
		for( char c:s.toCharArray()) {
			if(count[c-'a']==1) return c;
		}
		return '_';
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        FirstUnique obj = new FirstUnique();
        char result = obj.firstUniqueChar(input);

        if (result != '_') {
            System.out.println("First unique character is: " + result);
        } else {
            System.out.println("No unique character found");
        }

        sc.close();
    }
}



