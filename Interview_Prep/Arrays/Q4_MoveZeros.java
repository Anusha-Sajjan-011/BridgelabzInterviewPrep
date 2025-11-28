// Q4) Move all zeros to the end of the array.

public class Q4_MoveZeros {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int index = 0;

        for (int n : arr) {
            if (n != 0)
                arr[index++] = n;
        }

        while (index < arr.length)
            arr[index++] = 0;

        for (int x : arr)
            System.out.print(x + " ");
    }
}

/*
 * Initial
 * arr = [0, 1, 0, 3, 12]
 * index = 0
 * 
 * ✅ For-loop iterations
 * 
 * n = 0
 * 
 * 0 != 0 → false → no change
 * arr = [0, 1, 0, 3, 12]
 * index = 0
 * 
 * 
 * n = 1
 * 
 * 1 != 0 → true → arr[0] = 1
 * arr = [1, 1, 0, 3, 12]
 * index = 1
 * 
 * 
 * n = 0
 * 
 * 0 != 0 → false → no change
 * arr = [1, 1, 0, 3, 12]
 * index = 1
 * 
 * 
 * n = 3
 * 
 * 3 != 0 → true → arr[1] = 3
 * arr = [1, 3, 0, 3, 12]
 * index = 2
 * 
 * 
 * n = 12
 * 
 * 12 != 0 → true → arr[2] = 12
 * arr = [1, 3, 12, 3, 12]
 * index = 3
 * 
 * ✅ While-loop adds remaining zeros
 * index = 3 < 5 → arr[3] = 0 → index = 4
 * index = 4 < 5 → arr[4] = 0 → index = 5
 * 
 * 
 * Final array:
 * 
 * arr = [1, 3, 12, 0, 0]
 * 
 * ✅ Output
 * 1 3 12 0 0
 */