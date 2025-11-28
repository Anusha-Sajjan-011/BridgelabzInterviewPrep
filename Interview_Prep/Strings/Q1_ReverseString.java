// Reverse a Given String 

import java.util.Scanner;

public class Q1_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String value:");
        String input = sc.nextLine();
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        System.out.println("Reversed stirng :" + rev);
        sc.close();
    }
}
