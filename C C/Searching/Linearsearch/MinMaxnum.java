import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MinMaxnum {
public static void main(String[] args) {
    int[] array={2,3,4,5,6,7,8,12,45,75,-6};
    System.out.println("the minimum no. is : "+min(array));
    System.out.println("the max no. is " + max(array));

    
}   //assume arr.length !=0
    //return the minimum element of the array
static int min(int[] arr){
    int target=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<target){
            target=arr[i];//min ans will go to the position 'arr[0]' and will give the min val and similarly the max 
            //val will happen
        }
    }
    return target;
} 
static int max(int[] arr){
    int target=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>target){
            target=arr[i];
        }
    }
    return target;
}
}
