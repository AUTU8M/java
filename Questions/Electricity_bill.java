import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the toal number of unit: ");
        int num = input.nextInt();
        float bill;
        if (num <= 100) {
            bill = num * 1.5f;
        } else if (num <= 200) {
            bill = 100 * 1.5f + (num - 100) * 2.5f;
        } else if (num <= 300) {
            bill = 100 * 1.5f + 100 * 2.5f + (num - 200) * 5.00f;
        } else if (num <= 400) {
            bill = 100 * 1.5f + 100 * 2.5f + 100 * 5.00f + (num - 300) * 8.00f;
        } else {
            bill = 100 * 1.5f + 100 * 2.5f + 100 * 5.00f + 100 * 8.00f + (num - 400) * 10.00f;
        }
        System.out.println("the total elc bill is : " + bill);
    }
}
