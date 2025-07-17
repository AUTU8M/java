import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        float r = input.nextFloat();

        float area = r * r * 3.14f;
        System.out.println("the area of the circle is : "+ area );
    }
}
