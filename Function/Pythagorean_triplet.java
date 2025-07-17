import java.util.Scanner;

public class Pythagorean_triplet {
    public static void main(String[] args) {
        pyhogorean();

    }


    private static void pyhogorean() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int a, b, c;

        if (x >= y && x >= z) {
            c = x;
            a = y;
            b = z;
        } else if (y >= x && y >= z) {
            c = y;
            a = x;
            b = z;
        } else {
            c = z;
            a = x;
            b = y;
        }
        System.out.println("the max largest number is : " + c);
        if ((c * c) == (a * a) + (b * b)) {
            System.out.println("its pythogorean triplet");
        } else {
            System.out.println("its not");
        }
    }
}
