package condition_and_loops;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        System.out.print("enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int len = String.valueOf(num).length();

        String newnum = String.valueOf(num);
        String temp = "";

        for (int i = len - 1; i >= 0; i--) {
            temp += newnum.charAt(i);
        }
        System.out.println("the reversed num is " + temp);


    }
}
