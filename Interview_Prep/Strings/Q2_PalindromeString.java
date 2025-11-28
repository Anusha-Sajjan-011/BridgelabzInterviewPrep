import java.util.Scanner;

public class Q2_PalindromeString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value:");
        String input = sc.nextLine();
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        if (rev.equals(input)) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("not a palindrome");
        }
        sc.close();

    }
}