import java.util.*;

public class Q7_TwoSumPairs {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15, 3, 6 };
        int target = 9;

        Set<Integer> set = new HashSet<>();

        for (int n : arr) {
            int diff = target - n;
            if (set.contains(diff)) {
                System.out.println(diff + " + " + n + " = " + target);
            }
            set.add(n);
        }
    }
}
