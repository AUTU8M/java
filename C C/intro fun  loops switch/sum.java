import java.util.Scanner;
public class sum {
public static void main(String[] args) {
Scanner number= new Scanner(System.in);
int num1 = number.nextInt();
int num2 = number.nextInt();
int sum = num1 + num2;
System.out.println("the sum is : " +sum);
int no = (int)(66.555f);
System.out.println("the interger number will be : " +no);// this is known as typecasting


//automatic type promotion in expression
int a = 258;
byte b = (byte)(a);
System.out.println(b); // as byte can store maximum upto 256 so (258-256)=2 will be the out put and so on. / 258 % 256 = 2 that's what
                        //is happening here

                        
}
    
}
