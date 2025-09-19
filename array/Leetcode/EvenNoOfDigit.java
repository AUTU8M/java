public class EvenNoOfDigit {
    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 22, 7, 10, 5, 2, 13, 6};
        int[] result = EvenOdd(arr);
        System.out.println("the total number of even number is: " + result[0] + "\n" +
                "The total number of odd number is " + result[1]);
    }

    static int[] EvenOdd(int[] arr) {
        int evencount = 0;
        int oddcount = 0;
        for (int num : arr) {
            System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "odd"));
            if (num % 2 == 0) {
                evencount++;
            } else oddcount++;

        }
        return new int[]{evencount, oddcount};
    }
}
