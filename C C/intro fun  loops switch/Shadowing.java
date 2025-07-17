//shadowing in java means a practice using two variables with the same name within the same scope that overlaps
public class Shadowing {
    static int x=90;//this will be shadowed at line 11 becz of higher level scope
    static void fun(){
        System.out.println(x);
    }
    public static void main(String[] args) {
       System.out.println(x);
       fun();//wll give output 90
       x=32;//here i've updated the value of x do it's giving different output in next line
       fun();//will give output 32
    }
    
}
 