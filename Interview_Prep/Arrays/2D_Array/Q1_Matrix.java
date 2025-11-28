import java.util.Scanner;

public class Q1_Matrix {

    // Search the key in a matrix

    public static boolean Search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found at cell:(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // int n = 3, m = 3;
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println();
        // search
        Search(matrix, 5); // found key at cell: (1,1)
        sc.close();
    }

}

// I/P
// 1 2 3
// 4 5 6
// 7 8 9

// OP
// 1 2 3 4 5 6 7 8 9