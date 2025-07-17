import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //take input from the usesr untill use doesn't press x or x
     int ans=0;
    // now we will run an infinite loop
     while(true){
        //take the operator as input
        System.out.print("enter the operator: ");
        char op = in.next().trim().charAt(0);//here 'op' is as operator
        if(  op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            // now we gonna input two numbers v
            System.out.print("enter two numbers: ");
            int n1=in.nextInt();
            int n2=in.nextInt();
            if(op == '+'){
                ans = n1+n2;
            }
            if(op == '-'){
                ans = n1-n2;
            }
            if(op == '*'){
                ans = n1*n2;
            }
            if(op == '/'){
                ans = n1/n2;
            }
            if(op == '%'){
                ans = n1%n2;
            }         
        }
        else if (op == 'x' || op=='X'){
            break;
        }else{
            System.out.println("invalid operation!!");
        }
        System.out.println("the answer is : "+ans);
     }  
    }    
}
