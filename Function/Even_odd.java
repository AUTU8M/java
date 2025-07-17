import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = input.nextInt();
        Even_Odd(a);
    }

    public static void Even_Odd(int x) {
        if (x % 2 == 0) {
            System.out.println("its even number");
        } else {
            System.out.println("its odd number");
        }
    }

}
