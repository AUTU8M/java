import java.util.Scanner;
public class C_to_f {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    System.out.print("please enter the temp in c : ");
    
float tempc = in.nextFloat();//for typping the temperature via scanning
float tempf =(tempc * 9/5) +32;
System.out.println(tempf);

    }

} 