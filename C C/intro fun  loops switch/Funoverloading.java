/*function overloading means creating different function with same type parameters.or the number of arguments should be 
different. While function calling you dont provide the declared pareameter it will give error */
public class Funoverloading {
public static void main(String[] args) {
    fun(23);//here i'm initializing the value of 'a' and 'name' respectively
    fun("shubham");
    
}    
static void fun(int a){
System.out.println(a);
}
static void fun(String name){
System.out.println(name);
}
}
