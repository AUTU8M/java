import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the inputs: ");
        System.out.print("a : ");
        int a = input.nextInt();
        System.out.print("b : ");
        int b = input.nextInt();
        System.out.print("c : ");
        int c = input.nextInt();
        System.out.println("the max number is: "+ FunMax(a, b, c) );


        System.out.println("\nEnter the inputs: ");
        System.out.print("x : ");
        int x = input.nextInt();
        System.out.print("y : ");
        int y = input.nextInt();
        System.out.print("z : ");
        int z = input.nextInt();
        System.out.println("the min number is: "+ FunMin(x, y, z) );
    }

    public static int FunMax(int x, int y, int z) {
        if (x >= y && x >= z)
            return x;
        else if (y >= x && y >= z)
            return y;
        else
            return z;
    }

    public static int FunMin(int x, int y, int z) {
        if (x <= y && x <= z)
            return x;
        else if (y <= x && y <= z)
            return y;
        else
            return z;
    }

}
