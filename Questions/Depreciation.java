import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial cost of the asset: ");
        int ica = input.nextInt();
        System.out.print(" Enter the Salvage value: ");
        int salvage = input.nextInt();
        System.out.print("Enter the useful life: ");
        int useful_life = input.nextInt();

        float each_year_val = ica;
        float dpy = (float) (ica - salvage) / useful_life;
        for (int i = 1; i <= useful_life; i++) {

            each_year_val = each_year_val - dpy;
            System.out.println("the price of the asset on " + i + " is " + each_year_val);
        }
    }
}
