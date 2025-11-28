import java.util.Scanner;

public class Q7_CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int num = sc.nextInt();
        int count = 0;
        int n = Math.abs(num);

        if (n == 0) {
            count = 0;
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
