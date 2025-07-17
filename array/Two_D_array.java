
import java.util.Scanner;

public  class Two_D_array{
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int row = in.nextInt();
        System.out.println("enter the number of cols: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        //taking input
        System.out.println("enter the element in 2d array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
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