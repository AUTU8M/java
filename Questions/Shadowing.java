import java.util.Arrays;

public class Shadowing {
    public static void main(String[] args) {
fun(2);
fun(2,3);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int b,int c) {
        System.out.println(Arrays.toString(new int[]{b, c}));
    }
}
