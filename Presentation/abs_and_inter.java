abstract class parent{
    public parent(){
        System.out.println("I'm counstuctor");
    }

    public void sayhello(){
        System.out.println("hello sir!");
    }
    abstract public void greet();//even if there's a single abstract method in class it becomes a abstaract class
}
//inheritance
class child extends parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}
interface Bicycle{
    void applybreak(int decremet);
    void speedup(int incremetnt);
    
}
public class abs_and_inter{
public static void main(String[] args) {
   
}
}