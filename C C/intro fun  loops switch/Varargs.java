//variable length arguments : when you create a method that takes variable number of arguments that is called variable length arguments
import java.util.Arrays;
public class Varargs {
public static void main(String[] args) {
    fun(2,3,4,34,34);//here it is createing a array 
    
}    
static void fun(int ...v){                   /*it is actually making an array of intigers. when you are not sure how many variable you will need you use 
                                            this method. you can also create varargs of string !                                        */
System.out.println(Arrays.toString(v));//converting 'v' int array to string
int x=23;
String s=Integer.toString(x);
System.out.println(s  +s);



}
}
