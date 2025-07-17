import java.util.Scanner;
public class counting_occurance {
    public static void main(String[] args) {
       System.out.print("enter the number : "); 
       Scanner count = new Scanner(System.in);
       int n = count.nextInt();
       int i = 0;
       while(n > 0){
        int rem = n % 10;
        if ( rem == 5){
            i++;
        }
        n = n / 10; //>> n /= 10
       }
       System.out.println("the occureance is : "+i);
    }
}
