package Sorting_Algo;

public class InsertionSort {
    public static void insertionSorting(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertionSorting(arr);
        printArr(arr);
    }
}

/*
 * Below is a clear, step-by-step dry run in table format for your corrected
 * Insertion Sort code with the array:
 * 
 * {5, 4, 1, 3, 2}
 * 
 * ✅ Insertion Sort Dry Run (Table Format)
 * Initial Array
 * [5, 4, 1, 3, 2]
 * 
 * PASS 1 → i = 1
 * 
 * curr = 4
 * 
 * prev = 0
 * 
 * Check arr[prev] curr Condition (arr[0] > 4)
 * 1 5 4 true → shift
 * 
 * Shift
 * 
 * arr[1] = 5 → [5, 5, 1, 3, 2]
 * prev = -1
 * 
 * 
 * Insert curr at prev + 1 = 0
 * 
 * [4, 5, 1, 3, 2]
 * 
 * PASS 2 → i = 2
 * 
 * curr = 1
 * 
 * prev = 1
 * 
 * Step prev arr[prev] curr Condition (arr[prev] > curr)
 * 1 1 5 1 true → shift
 * 
 * Shift:
 * 
 * [4, 5, 5, 3, 2]
 * prev = 0
 * 
 * Step prev arr[prev] curr Condition
 * 2 0 4 1 true → shift
 * 
 * Shift:
 * 
 * [4, 4, 5, 3, 2]
 * prev = -1
 * 
 * 
 * Insert curr at index 0:
 * 
 * [1, 4, 5, 3, 2]
 * 
 * PASS 3 → i = 3
 * 
 * curr = 3
 * 
 * prev = 2
 * 
 * Step prev arr[prev] curr Condition
 * 1 2 5 3 true
 * 
 * Shift:
 * 
 * [1, 4, 5, 5, 2]
 * prev = 1
 * 
 * Step prev arr[prev] curr Condition
 * 2 1 4 3 true
 * 
 * Shift:
 * 
 * [1, 4, 4, 5, 2]
 * prev = 0
 * 
 * Step prev arr[prev] curr Condition
 * 3 0 1 3 false
 * 
 * Insert at index 1:
 * 
 * [1, 3, 4, 5, 2]
 * 
 * PASS 4 → i = 4
 * 
 * curr = 2
 * 
 * prev = 3
 * 
 * Step prev arr[prev] curr Condition
 * 1 3 5 2 true
 * 
 * Shift:
 * 
 * [1, 3, 4, 5, 5]
 * prev = 2
 * 
 * Step prev arr[prev] curr Condition
 * 2 2 4 2 true
 * 
 * Shift:
 * 
 * [1, 3, 4, 4, 5]
 * prev = 1
 * 
 * Step prev arr[prev] curr Condition
 * 3 1 3 2 true
 * 
 * Shift:
 * 
 * [1, 3, 3, 4, 5]
 * prev = 0
 * 
 * Step prev arr[prev] curr Condition
 * 4 0 1 2 false
 * 
 * Insert curr at index 1:
 * 
 * [1, 2, 3, 4, 5]
 * 
 * 🎉 Final Sorted Array
 * 1 2 3 4 5
 */