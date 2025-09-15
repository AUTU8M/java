public class celling {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };
        int target = 6;
        int result = FindCelling(arr, target);
        System.out.println(result);
    }

    static int FindCelling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end])
            return -1;
        while (start <= end) {
            // calculate the mid element
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return arr[start];
    }

}
