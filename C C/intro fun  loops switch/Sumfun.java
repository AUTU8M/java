//when there's a function in class it's called method 
//fuction is a block of code which can be used repetedly
//Q. take input of  number and print the sum
/*
   access modifier()return type (){
    //body
    //return statement
   }
*/
import java.util.Scanner;
public class Sumfun {
    public static void main(String[] args) {
sum(); //funciton call it will do the work for you every time you call the below function 
int ans = sum2();//return type sum will be now stored now in ans variabel
System.out.println("so the ans of second sum funciton is : "+ans);
        }
//return the value
static int sum2(){
    Scanner in = new Scanner(System.in);
    int num1, num2,sum;//defiend the variables

System.out.print("enter the 1st number : ");
num1= in.nextInt();
System.out.print("enter the 2nd number : ");
num2= in.nextInt();
sum = num1+num2;
return sum;//return basically mean the function is done it's over  we can't add anything after it in this function  
}


static void sum(){// here i'm creating sum function which can be called everywhwere 
    Scanner in = new Scanner(System.in);
    int num1, num2,sum;//defiend the variables
System.out.print("enter the 1st number : ");
num1= in.nextInt();
System.out.print("enter the 2nd number : ");
num2= in.nextInt();
sum = num1+num2;
System.out.println("the sum of two number is : "+sum);

    }

} 