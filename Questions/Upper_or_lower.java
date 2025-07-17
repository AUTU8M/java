import java.util.Locale;
import java.util.Scanner;

public class Upper_or_lower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter the char: ");
         String character = input.nextLine();

         char t = character.charAt(0);

     if(Character.isUpperCase(t)){
         System.out.println("the char "+t+" is Uppercase");
     } else if (Character.isLowerCase(t)) {

         System.out.println("the char "+t+" is Lowsercase");

     }else {
         System.out.println("print a Proper char ");
     }
    }
}