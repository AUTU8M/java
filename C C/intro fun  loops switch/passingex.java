import java.util.Scanner;
public class passingex{
public static void main(String[] args) {
      String chacha ="iron man";
      String gandu="mera loda tera mu me";
    greet(chacha);
    greet(gandu);
    }
    static void greet(String naam){//in java there is no such thing pass by refference there is only pass by value
        System.out.println(naam);// naam is going to have another refferenc value in strin section
    }
}
