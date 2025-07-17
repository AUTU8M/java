
import java.util.Arrays;
public class Passing_in_function {
    public static void main(String[] args) {
        int nums[]={3, 4, 5, 23 , 83};
        System.out.println(Arrays.toString(nums));
        change(nums);
    System.out.println(Arrays.toString(nums));//here i'm changing the original values with the function calling method
                                            //this is known mutable method. it means you can change the object.
                                            // strings aren't mutable though.

                }                                            
    static void change(int[] arr){
        arr[0]=99;
    }
}
