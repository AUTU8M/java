
import java.util.Arrays;
import java.util.Scanner;
public class Arraybasic{
    public static void main(String[] args) {
        //Q: store a roll number
        /* //syntax
         // datatype[] variable_name = new datatype[];
         */
        int[] roll= new int[5];
        int[] roll2 ={23, 22, 1, 45 ,76};
        int [] dec;// here i'm declaring my array
        dec=new int[4];//here i'm initializing my array and object is created in memory(heap)
        String[] arr = new String[4];
        System.out.println(arr[0]);//it will give null as output
        int[] arr1= new int [5];
        arr1[1]=12;//arr.length represnts the length of the array
        System.out.println();
        System.out.println("caution: now we'll do another operation ");
        //input using for loop
        
Scanner in = new Scanner(System.in);
int[] array = new int[6];

        for (int i=0; i<array.length;i++){
            array[i]= in.nextInt();
            
        }
        for(int i= 0; i<array.length;i++){
            System.out.print(array[i] + " ");
            //array of objects
            String[] str = new String[4];
            for (int j = 0; i<str.length;i++){
                str[j]=in.next();
            }
            System.out.println(Arrays.toString(str));
        }

    }
} 