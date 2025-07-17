public static void main(String[] args) {

    palindrome();
}

public static void palindrome() {
    System.out.print("Enter the input : ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    int original = num;
    int reversed = 0;

    while (num > 0) {
        int digit = num % 10;
        reversed = (reversed * 10) + digit;
        num /= 10;


    }
    if (original == reversed) {
        System.out.println("The number is palindrome ");
    } else {
        System.out.println("it's not. ");
    }
}
