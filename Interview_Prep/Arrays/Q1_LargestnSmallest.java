//Q1) Find the largest and smallest number in an array.

public class Q1_LargestnSmallest {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 50, 60, 30 };
        int min = arr[0];
        int max = arr[0];

        for (int n : arr) {
            if (n < min)
                min = n;
            if (n > max)
                max = n;
        }
        System.out.println("min :" + min);
        System.out.println("max: " + max);

    }
}