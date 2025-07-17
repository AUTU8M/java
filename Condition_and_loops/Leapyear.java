import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int num = input.nextInt();
        if ((num % 4 == 0) && ((num % 100 != 0) || (num % 400 == 0))) {

            System.out.println(num + " is leapyear!");

        } else {
            System.out.println(num + " is not leapyear");
        }
    }
}
