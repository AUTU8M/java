import java.util.Scanner;

public class Commission_percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total amount sold: ");
        int totalamt = Math.abs(input.nextInt());

        if (totalamt <= 10000) {
            comi(2, totalamt);
        } else if (totalamt <= 20000) {
            comi(5, totalamt);
        } else {
            comi(10, totalamt);
        }

    }

    static void comi(int p, int totalamt) {
        float com_amt = (p / 100f) * totalamt;
        System.out.println("the commission amt is : " + com_amt);

    }

}
