import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
Scanner fibo = new Scanner(System.in);
int n = fibo.nextInt();
int p = 0; //previous index
int i = 1;//current index 
int count = 2;
while ( count<=n){
int temp =i;
i = i+p;
p = temp;
count++;
}
System.out.println(i);
}    
}
