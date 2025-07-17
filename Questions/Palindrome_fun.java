public class Palindrome_fun {
    public static void main(String[] args) {
        int num = 121333;
        palindrome(num);
    }

    public static void palindrome(int num) {
        int original = num;
        int reversed = 0;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            reversed = reversed * 10 + digit;
            count++;
        }
        if (original == reversed) {
            System.out.println("its palindrome");
        } else {
            System.out.println("its not");
        }

    }
}
