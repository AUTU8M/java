
import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int[] arr={2,3, 4,5,6};
        swap(arr,1, 3);//swap doesn't return anything it just swaps the values
        System.out.println(Arrays.toString(arr));//here '5' and '3' are being swapped
    }
    static void swap(int[] arr, int index1 ,int  index2){//here i created a swap function
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
