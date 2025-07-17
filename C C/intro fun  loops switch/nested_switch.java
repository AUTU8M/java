// if there's a switch statement inside a switch statement it's called nested switch
import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID= in.nextInt();
        String dept = in.next();
        switch(empID){
            case 1: 
            System.out.println("bang bang");
            break;
            case 2:
            System.out.println("wallah habibi");
            break;
            case 3:
            switch(dept){ //in that case we can see that inside a switch statement there's a another switch statement this type of
            //case senario is called nested switch case
                case "IT":
                System.out.println("tech job");
                break;
                case "UG":
                System.out.println("teacher ");
                break;
                default:
                System.out.println("no deperment");
            }
            default: 
            System.out.println("lamde apna kam kar na");

        }

    }
    
}
//first it will normally work but if you choose to go with the case which got a nested switch case it will then chek for it and
// according to it will genarate output.
