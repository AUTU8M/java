import java.util.Scanner;

public class Maxval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the 3 inputs: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maxnum = a;

        if (b > maxnum) {
            maxnum = b;
        }
        if (c > maxnum) {
            maxnum = c;

        }
        System.out.println("the max num of these are " + maxnum);
    }
}
