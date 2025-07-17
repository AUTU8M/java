import java.util.Scanner;

public class Switch_basic {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        if (fruit.equals("mango")){// here '.equals' works as making a new object 
            System.out.println("it is king of fruit ");
        }
        if (fruit.equals("orage")){
            System.out.println("it is the fruit of winter ");
        }

// you can do these opeeration using this if else condition but it is optimal to use switch case statement for doing this operation
//lets give it a go here
/* the syntax will be as it goes

switch(expression){
    //cases 
    case one:
                //do something
    break;
    case two:
               //do something
    break;
    defult: 
            //do something
            //note duplicate cases are allowed
}
 */
    }
    
}
