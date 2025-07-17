import java.util.Scanner;//this line work as kind of import lirary of c it will help us to import scanner class in this code

public class First { // public means how the data is shared with you and the class suggests the name
                     // of the file name which in that case is 'First'

    public static void main(String[] args)// here this work as main function & command line arguments 'string' and
                                          // 'args' work as array
                                          // and static work as running the code without making any objects
    {
        System.out.println("hello world");// here system out will work as to give print output so we are using
                                          // 'system.out'
                                          
        System.out.println("hello how are you  ?");


    Scanner input = new Scanner(System.in); // here as input is taken from keyboard so we are using 'system.in' &
                                                // here we are creating a input variable
    System.out.print("plz enter the name: ");
    String name =input.nextLine();
        System.out.println("the name is : " + name); // here 'nextINt' working as to print new inputs and 'nextLine' will work
                                              // as to print a whole line
    System.out.println("the entered number is: "+input.nextLine());//in this way you can directly input and print 
                                                                   //first case you gotta type the input next line it will give the print statement 
    
    System.out.print("plz enter the roll no : ");
     Scanner Input = new Scanner(System.in);
     int rollno = Input.nextInt();
     System.out.println("your roll no is : " +rollno);

        System.out.print("plase enter another number: ");
     Scanner autumn = new Scanner(System.in);
     int cricket = autumn.nextInt();
     int sum=rollno +cricket;  //here we used 2 diffent objects using other variables and made a easy sum funtion 
     System.out.println("the player no. is : "+sum);
    }
}
/*                                                    
primitive data types : the datatypes that can't be broken into further parts
int rollno = 78;
char letter = 'r';
float = 34.54f;
double largedecimalnumbers = 34533.3434;
long largeinteger values = 3455553333333L;
boolean check = false/ture;
string name = "name"; //btw string is not a primitive data type but char is primitive
*In any programming language a Literal is a constant value, where as identifiers can change their values*   
[ int a= 20; ]--case 'a' will work as identifier and '20'will be literal
*/