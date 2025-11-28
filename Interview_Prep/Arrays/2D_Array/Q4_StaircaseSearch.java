// staircase serach problem - > key cell
public class Q4_StaircaseSearch {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 200, 200 }, { 400, 500, 600, 700 } };
        int key = 100;
        System.out.println(searchKey(matrix, key));
    }

    public static boolean searchKey(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at (" + row + " " + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
}
