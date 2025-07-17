import java.util.Scanner;

public class Lcm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();
        int i = 0;
        int original = n1;
        int original1 = n2;
        while (n2 != 0) {

            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
            i++;


        }
        int gcd = n1;
        System.out.println("the Gcd is : " + n1);

        int Lcm = Math.abs(original * original1)/gcd;
        System.out.println("the Lcm is : "+ Lcm);

    }
}
