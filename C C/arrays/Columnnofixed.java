
import java.util.Scanner;

public class Columnnofixed {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int[][] arr ={
            { 1 , 4 , 34 ,34},
            {5,6},
            {34,45,65,78}
        };
        
    //output
    for(int r=0;r<arr.length;r++){
        for(int c=0;c<arr[r].length;c++){// as the length of rows are different thus we have to consider the length of the array
           System.out.print(arr[r][c]+" ");
    }
    System.out.println();
}
    }
}