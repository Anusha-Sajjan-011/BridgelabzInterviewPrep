package recursion;

public class Q1_PrintNumbers {

    public static void printNumbers(int n) {
        if (n <= 10) {
            System.out.print(n);
            printNumbers(n + 1);
        }

    }

    public static void main(String[] args) {
        printNumbers(1);
    }
}
