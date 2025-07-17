import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int num_of_sub = input.nextInt();

        float cgpa_total = 0;
        float total_hours = 0;
        for (int i = 1; i <= num_of_sub; i++) {

            System.out.print("For subject " + i + " Enter the Grade point : ");
            int grade_point = input.nextInt();

            System.out.print("For subject " + i + " Enter the credit hours: ");
            int credit_hours = input.nextInt();

            cgpa_total +=(float) (grade_point * credit_hours);
            total_hours += credit_hours;
        }
        System.out.println("the CGPA is " + (cgpa_total/total_hours));
    }
}
