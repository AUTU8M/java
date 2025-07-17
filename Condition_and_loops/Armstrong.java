package Condition_and_loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int start = input.nextInt();
        System.out.print("enter the second number: ");
        int end = input.nextInt();

        System.out.println("the armstrong number between " + start + " and " + end + " is: ");
        for (int num = start; num < end; num++) {
            int original = num;
            int temp = num;
            int sum = 0;

            int numlen = String.valueOf(num).length(); //convert to string then to length

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, numlen);
                temp = temp / 10;
            }
            if(sum==original){
                System.out.println(original);
            }
        }
        input.close();

    }
}
