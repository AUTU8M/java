import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
       try (Scanner in = new Scanner(System.in)) {
        char ch = in.next().trim().charAt(0);//it's cutting all the spaces of it and taking only the fist word of it
                                                        //later we'll cover up the last parts of it
                                                        // here index is working as which part of the chat it's going to print
        

if(ch>='a' && ch<='z'){
        System.out.println("Lowercase");
}else{
        System.out.println("Uppercase");
}
    }
    }
}
