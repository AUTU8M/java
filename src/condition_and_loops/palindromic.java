package condition_and_loops;

import java.util.Scanner;

public class palindromic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the word: ");
        String word = input.nextLine();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println("for " + word + " the reversed word is : " + reversed);

        if (word.equals(reversed)) {
            System.out.println(" the word is palindromic");
        } else {
            System.out.println("enter a proper palindromic text");
        }
    }
}