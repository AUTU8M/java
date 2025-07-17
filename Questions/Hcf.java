import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();
        int i = 0;

        while (n2 != 0) {

            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
            i++;


        }

        System.out.println("the is: " + n1);
    }
}
