import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        int total_amt = input.nextInt();

        System.out.print("Enter the interest rate: ");
        int interest_rate = input.nextInt();

        System.out.print("Enter the duration of interest: ");
        int time_in_years = input.nextInt();

        System.out.print("Number of times interest applied per year(n): ");
        int times_per_year = input.nextInt();


        double total_compound_amt = (total_amt * (Math.pow((1 +
                ( (double) interest_rate / (100 * times_per_year))), (time_in_years * times_per_year))));

        double compound_interest = total_compound_amt - total_amt;

        System.out.println("total compound interest is : " + total_compound_amt);
        System.out.println("compound interest is: " + compound_interest);


    }


}


