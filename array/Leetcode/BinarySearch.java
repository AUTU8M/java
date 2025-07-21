public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-45, -23, -10, -5, 0, 1, 2, 3, 4, 23, 45, 67, 87};
        int target = -45;
        System.out.println(BinarySearchFn(arr, target));
    }

    //return the index
    //return the index if it doesn't exist
    static int BinarySearchFn(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            //now we gon calculate the middle value
            int mid = start + (end - start) / 2;
            //now we do the searching
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }


        }

        return -1;
    }
}
