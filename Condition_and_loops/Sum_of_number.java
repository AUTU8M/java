import java.util.Scanner;

public class Sum_of_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ; ");
        int num = input.nextInt();
        int original = num;
        int sum = 0;
        int length = Integer.toString(num).length();

        for (int i = 0; i < length; i++) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println("the sum of " + original + " is: " + sum);

    }
}
