import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char ch = input.next().charAt(0);

        char lower = Character.toLowerCase(ch);

        if (lower >= 'a' && lower <= 'z') {
            System.out.println("its a valid input!");

            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println("its vowel!");
            } else {
                System.out.println("its consonant!");
            }
        } else {
            System.out.println("enter a proper char!");
        }
    }
}
