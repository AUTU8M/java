import java.util.Scanner;

public class Same_number_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();
        for (int current_num = 0; current_num <= 9; current_num++) {
            int temp = num;
            int count = 0;

            while (temp != 0) {
                int last_number = temp % 10;
                if (current_num == last_number) {
                    count++;
                }
                temp = temp / 10;
            }
            if (count >= 2) {

                System.out.println("in the number " + num + " the digit " + current_num + " appres " + count + " time(s).");

            }
        }

    }
}

