
import java.util.Arrays;

public class Array_from_permutation {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }

        System.out.print(Arrays.toString(ans));
    }

}
