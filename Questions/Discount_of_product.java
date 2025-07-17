import java.util.Scanner;

public class Discount_of_product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the MRP of the product : ");
        int amt = input.nextInt();
        System.out.print("Enter the discount Percentage: ");
        int percen = input.nextInt();

        float DA = (percen / 100f) * amt;
        float DP = amt-DA;
        System.out.println("the Discounted price is "+ DP);
    }
}
