package com.array;

public class AddString {


    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;
        String ans = "";

        while (i >= 0 || j >= 0) {
            int d1 = 0, d2 = 0;

            if (i >= 0)
                d1 = num1.charAt(i) - '0';

            if (j >= 0)
                d2 = num2.charAt(j) - '0';

            int sum = d1 + d2 + carry;

            int rem = sum % 10;
            carry = sum / 10;

            ans = (char)(rem + '0') + ans;

            i--;
            j--;
        }

        if (carry > 0) {
            ans = (char)(carry + '0') + ans;
        }

        return ans;
    }
}