public class Linear_search {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 54, 67, -90, 57};
        int target = 67;
        int result = LinearSearch(arr, target);

        System.out.println(
                result == -1
                        ? "target not found"
                        : "target found at " + result + " index"
        );
    }

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;


        }
        return -1;
    }
}