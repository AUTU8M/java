import java.util.Scanner;

public  class Fibonacchi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a = 0, b = 1;
        System.out.println("fibonacchi number series is : ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next_total = a + b;
            a = b;
            b = next_total;
        }
    }
}