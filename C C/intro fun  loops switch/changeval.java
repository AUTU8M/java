import java.util.Arrays;
public class changeval {
public static void main(String[] args) {
   //create an array
    int[] testarray ={ 1,3,6,7,8,9};
    change(testarray);
    System.out.println(Arrays.toString(testarray));
 
}   

static void change(int[] nums){
    nums[0]=99;
    nums[1]=34;
}
}
