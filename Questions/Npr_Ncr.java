import java.util.Scanner;

public class Npr_Ncr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of items: ");
        int num = input.nextInt();
        System.out.print("Number of items to choose : ");
        int r = input.nextInt();

        float npr = (float) factorial(num) / factorial((num - r));

        float ncr = (float) factorial(num) / ((factorial(r) * factorial((num - r))));


        System.out.println("the npr is " + npr);
        System.out.println("the ncr is " + ncr);
    }

    static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
