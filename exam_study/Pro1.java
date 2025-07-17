package exam_study;
import java.util.Scanner;
public class Pro1 {
    public static void main(String[] args) {
        // code goes here
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        while (a > 0) {
            String word, guessword;
            String check = "";
            System.out.println("enter the inputs: ");
            word = input.next();
            guessword = input.next();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guessword.charAt(i)) {
                    check = check + "G";
                } else {
                    check = check + "B";
                }
            }
            System.out.println("RESULT :\n"+check);
        }
        input.close();
    }
}
