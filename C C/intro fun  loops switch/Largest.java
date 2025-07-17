//choose the biggest number out of them
import java.util.Scanner;
public class Largest {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // System.out.println("enter the three numbers : ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

     int max = a;

     if(b>a){
        max=b;
     }
     if(c>a){
        max=c;
     }
     System.out.println("the largest number among them is : " +max);
}   
}
