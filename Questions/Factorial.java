import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();

        int temp = 1;
        int original = num;
        for (int i = 1; i <= num; i++) {
            temp = temp * i;


        }

        System.out.println("the  for "+ original+"! is " + temp);
    }
}