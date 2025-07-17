import java.util.Scanner;

public class Distance_between_2p {
    private static float distance1;

    public static void main(String[] args) {

        fun();
    }

    static void fun() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the input for x1: ");
        float x1 = input.nextFloat();

        System.out.print("enter the input for y1: ");
        float y1 = input.nextFloat();

        System.out.print("enter the input for x2: ");
        float x2 = input.nextFloat();


        System.out.print("enter the input for y2: ");
        float y2 = input.nextFloat();


        float distance = (float) Math.sqrt((float) Math.pow((x2 - x1), 2) + ((float) Math.pow((y2 - y1), 2)));
        System.out.println("The distance is : " + distance);
    }
}
