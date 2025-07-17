import java.util.Scanner;

public class Factorial_fun {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        System.out.println("the factorial is : " + Factorial(i));
    }

    public static int Factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {

            result *= i;

        }
        return result;
    }
}
