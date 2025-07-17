import java.util.Scanner;

public class Avrage_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int num = input.nextInt();
        int sum = 0;
        System.out.println("enter the numbers: ");
        for (int i = 1; i <= num; i++) {
            int enterednum = input.nextInt();
            sum = sum + enterednum;

        }
        System.out.println("the sum is : "+ sum);
        System.out.println("the avrage is : "+ ((float)(sum/num)));
    }
}
