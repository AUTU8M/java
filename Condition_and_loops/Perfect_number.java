import java.util.Scanner;

public class Perfect_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= (num / 2); i++) {
            int remainder = num % i;
            if (remainder == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");


        }
    }
}