/*package array_2D;

public class armStrongNumber {
	public static boolean isArmstrong(int n) {
	    int original = n;
	    int sum = 0;

	    int digits = String.valueOf(n).length();

	    while(n > 0) {
	        int digit = n % 10;
	        sum += Math.pow(digit, digits);
	        n /= 10;
	    }

	    return sum == original;
	}

}*/
package array_2D;

import java.util.Scanner;

public class armStrongNumber {

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += (int)Math.pow(digit, digits); 
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
