// taking input 2d array and printing it

import java.util.Arrays;
import java.util.Scanner;
public class MultidimentionArray {   
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int [][] arr = new int[3][3];//no of rows 
        System.out.println(arr.length);
            //input
           for(int row =0;row<arr.length;row++){
          //for each col in every row 
          for(int col=0;col<arr[row].length;col++){
            arr[row][col]=input.nextInt();
          }  
           }
           //output
           System.out.println("the array is: ");
           for(int row =0;row<arr.length;row++){
            //for each col in every row 
            for(int col=0;col<arr[row].length;col++){
             System.out.print(arr[row][col] + " ");
            } 
            System.out.println();//it will print a new line, it will print a row first then print a line then reapat the loop

            }
            // you can do it a similar string process but smaller
            System.out.println("the string process goes like this >> ");
            for(int s=0;s<arr.length;s++){
              System.out.println(Arrays.toString(arr[s]));//it is actually converting the array to string and then it is 
                                                          //printing it
            }                                             // **remember this method is only for printing the output
    
    }
    
}
