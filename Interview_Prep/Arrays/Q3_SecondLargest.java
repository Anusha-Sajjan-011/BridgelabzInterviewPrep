// Q3) Find the second largest element.

public class Q3_SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 4, 5, 60, 1 };
        int second = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }
        System.out.println(second);

    }
}
// ----------------------------------------------------------------------------------------------------

// Start:
// max = -∞, second = -∞

// n=10 → 10 > max → max=10, second=-∞
// n=20 → 20 > max → max=20, second=10
// n=4 → no change
// n=45 → 45 > max → max=45, second=20
// n=99 → 99 > max → max=99, second=45

// ------------------------------------------------------------------------------------------------------------------

// ✅ Initial Values
// arr = {10, 20, 4, 45, 99}
// max = -2147483648 (Integer.MIN_VALUE)
// second = -2147483648

// ✅ Iteration 1

// n = 10

// Check:

// 10 > max(-2147483648) ✅ → true
// → update:

// second = max = -2147483648
// max = 10

// Current state:

// max = 10
// second = -2147483648

// ✅ Iteration 2

// n = 20

// Check:

// 20 > max(10) ✅ → true
// → update:

// second = max = 10
// max = 20

// Current state:

// max = 20
// second = 10

// ✅ Iteration 3

// n = 4

// Check:

// 4 > max(20) ❌ → false

// 4 > second(10) && 4 != max(20) ❌ → false

// No update.

// Current state:

// max = 20
// second = 10

// ✅ Iteration 4

// n = 45

// Check:

// 45 > max(20) ✅ → true
// → update:

// second = max = 20
// max = 45

// Current state:

// max = 45
// second = 20

// ✅ Iteration 5

// n = 99

// Check:

// 99 > max(45) ✅ → true
// → update:

// second = max = 45
// max = 99

// Final state:

// max = 99
// second = 45

// ✅ Final Output
// Second Largest = 45