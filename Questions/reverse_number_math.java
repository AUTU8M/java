import java.util.Scanner;

public class reverse_number_math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = input.nextInt();

        int reversed = 0;
        int original_number = number;
        int count = 0;
        while (number != 0) {
            int last_digit = number % 10;
            reversed = (reversed * 10) + last_digit;
            number = number / 10;
            count++;
        }
        System.out.println("for " + original_number + " the reversed version is: " + reversed);
        input.close();
    }
}
