public class Q5_RotateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        for (int n : arr)
            System.out.print(n + " ");
    }

    static void reverse(int[] arr, int a, int b) {
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

}

// Below is a clear, interview-ready explanation + structured dry run for the
// rotation algorithm.

/*
 * ✅Objective
 * 
 * Rotate array
 * right by
 * k positions.
 * 
 * Example:
 * 
 * Input→[1,2,3,4,5,6],k=2 Output→[5,6,1,2,3,4]
 * 
 * ✅
 * 
 * Core Logic (3-step reverse strategy)
 * 
 * 1️⃣ Normalize k
 * 
 * k = k % arr.length;
 * 
 * Prevents overflow (e.g., k = 20 on size 6 array).
 * 
 * 2️⃣ Reverse entire array
 * 
 * reverse(arr, 0, arr.length - 1);
 * 
 * 
 * Transforms:
 * 
 * [1, 2, 3, 4, 5, 6] → [6, 5, 4, 3, 2, 1]
 * 
 * 
 * 3️⃣ Reverse first k elements
 * 
 * reverse(arr, 0, k - 1);
 * 
 * Reverses segment (0 → 1):
 * 
 * [6, 5] → [5, 6]
 * 
 * 
 * Array becomes:
 * 
 * [5, 6, 4, 3, 2, 1]
 * 
 * 
 * 4️⃣ Reverse remaining part
 * 
 * reverse(arr, k, arr.length - 1);
 * 
 * Reverses segment (2 → 5):
 * 
 * [4, 3, 2, 1] → [1, 2, 3, 4]
 * 
 * 
 * Final array:
 * 
 * [5, 6, 1, 2, 3, 4]
 * 
 * 
 * ✅ Rotation completed in-place.
 * 
 * ✅ Why this works
 * 
 * Reversing reorganizes segments without extra memory.
 * 
 * Mathematically:
 * 
 * Rotate Right by k
 * = Reverse Whole
 * = Reverse First k
 * = Reverse Remaining
 * 
 * 
 * Time complexity → O(n)
 * Space complexity → O(1)
 * Industry-approved optimization.
 * 
 * ✅ Detailed Dry Run
 * 
 * Initial:
 * 
 * arr = [1, 2, 3, 4, 5, 6]
 * k = 2
 * 
 * Step 1 — Reverse whole array
 * reverse(arr, 0, 5)
 * 
 * Swap(0,5) → [6, 2, 3, 4, 5, 1]
 * Swap(1,4) → [6, 5, 3, 4, 2, 1]
 * Swap(2,3) → [6, 5, 4, 3, 2, 1]
 * 
 * 
 * Result:
 * 
 * [6, 5, 4, 3, 2, 1]
 * 
 * Step 2 — Reverse first k elements
 * reverse(arr, 0, 1)
 * 
 * Swap(0,1) → [5, 6, 4, 3, 2, 1]
 * 
 * 
 * Result:
 * 
 * [5, 6, 4, 3, 2, 1]
 * 
 * Step 3 — Reverse remaining elements
 * reverse(arr, 2, 5)
 * 
 * Swap(2,5) → [5, 6, 1, 3, 2, 4]
 * Swap(3,4) → [5, 6, 1, 2, 3, 4]
 * 
 * 
 * Final Output:
 * 
 * [5, 6, 1, 2, 3, 4]
 */