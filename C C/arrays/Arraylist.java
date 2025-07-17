
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
     //syntax
     ArrayList<Integer> list= new ArrayList<Integer>(2);  //when you don't know the size of array you use this method
    list.add(67);
    list.add(63);
    list.add(23);
    list.add(543);
    list.add(789);
    list.add(123);
    
  System.out.println(list);
  System.out.println(list.contains(789));//>will give true
  System.out.println(list.contains(788));// it means does it contain 788 if yes then true>> will give false
      list.set(0,99);  // changing the zeroth index to 99 
       list.remove(2);//remove index no. 2 so 63 will be removed 
    //     for (int i = 0; i<5;i++){  
    //        System.out.println(list.get(i));      //get item at any index 
      Scanner in = new Scanner(System.in);
      int input=in.nextInt();
      for(int i=0;i<5;i++){
         list.add(in.nextInt());
      }
    //get any item at any index
    for( int i = 0;i<5;i++){
      System.out.println(list.get(i));//pass index here, list[index] systax will not work here
    }
    
       }
    }
    

