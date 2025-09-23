
import java.util.Arrays;

public class Row_Col_matrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 12, 22, 33, 44 },
                { 13, 23, 34, 45 },
                { 17, 27, 38, 49 }

        };
        System.out.println(Arrays.toString(search(arr, 38)));

    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        while (c >= 0 && r < matrix.length) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] { -1, -1 };
    }

}
