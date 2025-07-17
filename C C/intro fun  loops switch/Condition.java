
import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        

        int salary = 34000;
        if(salary>20000){
            salary = salary + 1070;
        }else{
            salary = salary + 530; 
        }
        System.out.println("the total bonous salary is : "+salary);
        
    }
}
//so when to use which loop we will briefly talk about it
/*
use while loop when you don't know how many times the loop will run for
and use for loop when you don't know how many time loop will run for
use do while loop when you don't know how many times the loop will run for but the code will atleast execute '1' time then it will check
the conditioin
sometime using while loop makes the code look much more clean than the other loops
 */