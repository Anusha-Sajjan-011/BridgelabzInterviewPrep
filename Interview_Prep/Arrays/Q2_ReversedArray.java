// Q2) Reverse an array in-place.

public class Q2_ReversedArray {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int n : arr) {
            System.out.println(n + " ");
        }
    }

}
