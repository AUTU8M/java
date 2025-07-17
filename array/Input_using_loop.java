import java.util.Arrays;
import java.util.Scanner;

public class Input_using_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

//        System.out.println(Arrays.toString(arr));

        for (int num : arr) {       //for every element in the array , print the element
            System.out.print(num + " ");
        }
    }
}
