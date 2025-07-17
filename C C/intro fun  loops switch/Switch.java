import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
          String fruit = in.next();
   switch (fruit){
          case "mango":
          System.out.println("king of fruit ");
          break;
          case "orange":
          System.out.println("winter fruit");
          break;
          case "berry":
          System.out.println("sweet fruit");
          break;
          default:
          System.out.println("please enter a valid fruit");
   }
        }
        try (//there is also a simpler version of it , it is as follows , it is more neat and more easier to understand and syntax is shorter
            //you don't need to use break
      Scanner input = new Scanner(System.in)) {
        String fol = input.next();
        switch(fol){
          case "pen" -> System.out.println("it is used to write");
          case "page" -> System.out.println("the things are writtern on it");
          case "eraser" ->System.out.println("it is used to erase the stuff ");
          case "default" ->System.out.println("please give a valid input");
        }
      }
    }
    
}
