import java.util.Scanner;
public class Prime {

    public static void main(String[] args) {
        fun(23);
        fun(8);
    }
    static void fun(int n){

        if(n<=1){
            System.out.println("it's not a prime number");
        }
        int c=2;
        while( c*c <= n){
if(n%c==0) {
    System.out.println("it's not a prime number");
}c++;
        }
    }
}
