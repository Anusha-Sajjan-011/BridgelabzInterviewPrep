package Sorting_Algo;

public class SelectionSort {
    public static void selectionSortt(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSortt(arr);
        printArr(arr);
    }

}

/*
 * Pass 1 (i = 0)
 * | Step | i | j | arr[j] | Current minPos | arr[minPos] | Array State |
 * | ---- | - | - | ------ | -------------- | ----------- | ------------- |
 * | Init | 0 | - | - | 0 | 5 | 5 4 1 3 2 |
 * | 1 | 0 | 1 | 4 | 1 | 4 | 5 4 1 3 2 |
 * | 2 | 0 | 2 | 1 | 2 | 1 | 5 4 1 3 2 |
 * | 3 | 0 | 3 | 3 | 2 | 1 | 5 4 1 3 2 |
 * | 4 | 0 | 4 | 2 | 2 | 1 | 5 4 1 3 2 |
 * | Swap | - | - | - | - | - | **1 4 5 3 2** |
 * 
 * 
 * Pass 2 (i = 1)
 * | Step | i | j | arr[j] | Current minPos | arr[minPos] | Array State |
 * | ---- | - | - | ------ | -------------- | ----------- | ------------- |
 * | Init | 1 | - | - | 1 | 4 | 1 4 5 3 2 |
 * | 1 | 1 | 2 | 5 | 1 | 4 | 1 4 5 3 2 |
 * | 2 | 1 | 3 | 3 | 3 | 3 | 1 4 5 3 2 |
 * | 3 | 1 | 4 | 2 | 4 | 2 | 1 4 5 3 2 |
 * | Swap | - | - | - | - | - | **1 2 5 3 4** |
 * 
 * Pass 3 (i = 2)
 * | Step | i | j | arr[j] | Current minPos | arr[minPos] | Array State |
 * | ---- | - | - | ------ | -------------- | ----------- | ------------- |
 * | Init | 2 | - | - | 2 | 5 | 1 2 5 3 4 |
 * | 1 | 2 | 3 | 3 | 3 | 3 | 1 2 5 3 4 |
 * | 2 | 2 | 4 | 4 | 3 | 3 | 1 2 5 3 4 |
 * | Swap | - | - | - | - | - | **1 2 3 5 4** |
 * 
 * Pass 4 (i = 3)
 * | Step | i | j | arr[j] | Current minPos | arr[minPos] | Array State |
 * | ---- | - | - | ------ | -------------- | ----------- | ------------- |
 * | Init | 3 | - | - | 3 | 5 | 1 2 3 5 4 |
 * | 1 | 3 | 4 | 4 | 4 | 4 | 1 2 3 5 4 |
 * | Swap | - | - | - | - | - | **1 2 3 4 5** |
 * 
 * 
 * Pass 5 (i = 4)
 * | Step | i | j | arr[j] | minPos | Array State |
 * | ----- | - | - | ------ | ------ | ----------- |
 * | Final | 4 | - | - | 4 | 1 2 3 4 5 |
 * 
 * 
 * 
 * 
 * Final output 1 2 3 4 5
 * 
 */
