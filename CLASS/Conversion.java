//make 3 different classes and use them altogether in main function 

import java.util.Scanner;
class Temp{ 
    void alter(){
    System.out.print("enter the temp: ");
    float Fahrenheit, Celsius;  
    Scanner input=new Scanner(System.in);
    float cel =input.nextFloat();
    Fahrenheit =((cel*9)/5)+32;  
    System.out.print("Temperature in Fahrenheit is: "+Fahrenheit);  
}}
class Curr{
     
    void alter1(){
		float dollars;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter dollars:");
		dollars = in.nextLong();
		float rupees = dollars * 82;
		System.out.print(rupees + " Rupees");
}}
class menu{
    void alter2(){
    Scanner input= new Scanner(System.in);
    System.out.print("enter a number: ");
    int num=input.nextInt();
    
    switch(num){
        case 1:
             Temp cd = new Temp();
             cd.alter();
        case 2: 
        Curr rs = new Curr();
        rs.alter1();

    }
}}

public class Conversion {

    public static void main(String[] args) {
     menu call = new menu();
        call.alter2();//calling call class and it's subfloder alter2
    }
}
