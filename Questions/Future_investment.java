import java.util.Scanner;

public class Future_investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the initial investment: ");
        double pv = input.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        float r = input.nextFloat();

        System.out.print("Enter the number of compounding periods per year: ");
        int n = input.nextInt();

        System.out.print("Enter the number of years: ");
        int t = input.nextInt();


        float fv = (float) (pv * Math.pow((1 + (r / (100 * n))), (n * t)));

        System.out.println("the Future investment would be: " + fv);
    }
}
