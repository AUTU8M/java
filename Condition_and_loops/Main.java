import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        float cel = input.nextFloat();

        float fertemp = (cel * 9 / 5) + 32;

        System.out.println("the temp is fernheit is: " + fertemp);

    }
}