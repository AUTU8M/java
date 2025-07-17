import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        System.out.print("please enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        System.out.println("the circumference of the circle is "+circumference(r));
    }

    public static double circumference(int r) {
        double pi=3.14;
        double result  = 2 * pi * r;
        return result;
    }

}

