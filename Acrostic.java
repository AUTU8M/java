
import java.util.Scanner;

class MatrixCheck{
    void acrosticCheck(char arr[][], int col , int row){
        boolean flag = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != arr[j][i]){
                    flag = false; 
                }
            }
        }
        
        if (flag){
            System.out.println("this is acrostic");
        }else{
            System.out.println("This is not acrostic");
        }
    }
}

public class Acrostic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row , col;
        System.out.println("Enter the Column And row number :: ");
        System.out.println("Enter column number: ");
        col = scanner.nextInt(); 
        System.out.println("enter the row number: ");
        row = scanner.nextInt();
        System.out.println("Enter the string input in array : ");
        char[][] arr =  new char[row][col];
        for (int i = 0; i < row; i++) {
                arr[i]= scanner.next().toCharArray();
        }    
        
        MatrixCheck matrix = new MatrixCheck();
        matrix.acrosticCheck(arr, col, row);
    }
}
