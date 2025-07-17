import java.util.Scanner;

public class Average_marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of subjects: ");
        int num_of_sub = input.nextInt();

        int total = 0;

        for (int i = 1; i <= num_of_sub; i++) {
            System.out.println("Enter the marks for sub " + i + " : ");
            int marks = input.nextInt();
            total += marks;

        }
        System.out.println("The average marks is : " + (((float) total / num_of_sub)));
    }
}
