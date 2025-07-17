import java.util.Arrays;
public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr={
            {2,3,4,23,12,98},
            {12,32,89,9},
            {78,9,23,45},
            {2,5}
          
        };
        int target=23;
        int[] ans =search(arr, target);
        System.out.println(Arrays.toString(ans));
    
    }
    static int[] search(int[][] arr, int target){
          for(int r=0;r<arr.length;r++){
                for(int c=0;c<arr[r].length;c++){
                        if(arr[r][c]==target){
                            return new int[]{r,c};
                        }
                }
          }
        return null;//if you can't find anything it'll return null
    }
    
} 