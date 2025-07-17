import java.util.Scanner;

public class Taking_input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = in.nextInt();
        System.out.println("Enter the number of cols: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        // Taking input
        System.out.println("Enter the elements in 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {  // FIXED line
                System.out.print("Element at (" + i + "," + j + "): ");
                arr[i][j] = in.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
