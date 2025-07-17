import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        int length = string.length();

        String result = "";
        for (int i = (length - 1); i >= 0; i--) {
            result += string.charAt(i);

        }
        System.out.println(result);

    }
}
