public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10, 12};  // Ascending
        int[] arr2 = {100, 90, 80, 70, 60}; // Descending

        int target = 10;
        int result = AgnosticBS(arr1, target);
        System.out.println(result);
    }

    static int AgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        boolean isAscending = arr[start] < arr[end];

        //do the binary search
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;
            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;//not found
    }
}
