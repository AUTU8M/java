import java.util.Scanner; //importing scanner class for I/O operations.

interface Bank_ATM {
    void Get_User_Information(); // declaring method inside an interface.
}

abstract class State_Bank implements Bank_ATM { // class to implement interface method.
    abstract void Cash_Withdrawal();

    abstract void Cash_Deposit(); // declaring abstract methods inside an abstract class.

    abstract void Check_Balance();

    Scanner input = new Scanner(System.in);

    public void Get_User_Information() { // method to print user credentials..
        int pin1 = 1234;
        int pin2 = 8900;
        int confirm_pin;
        System.out.print("Please enter your PIN: "); // asking pin from the user..
        confirm_pin = input.nextInt(); // storing it in variable..
        switch (confirm_pin) { // switch case to print credentials of users..
            case 1234:
                System.out.print("Name: Shubham sarkar\nAge: 20\nGenger: Male\nAcc no:54112680");
                break;
            case 8900:
                System.out.print("Name: Shadan alam\nAge: 20\nGenger: Male\nAcc no:56475463");
                break;
            default:
                System.out.print("ERROR!! enter correct pin"); // to handle invalid inputs..
                break;
        }
    }
}

class Reserve_Bank extends State_Bank {// concrete class to implement abstract methods of above abstract class..
    private int pin = 6969;
    private double balance = 10000; // declaring and initializing necessary variables..
    int confirm_pin;
    double withdraw, deposit;
    Scanner input = new Scanner(System.in);

    public void Cash_Withdrawal() {
        System.out.print("Please enter your PIN: ");
        confirm_pin = input.nextInt();
        if (confirm_pin == pin) { // compairing pin..
            System.out.print("Access granted..\n");
            System.out.println("How much amount you want to withdraw?");
            withdraw = input.nextDouble(); // asking amount for withdrawal and storing in variable.
            if (withdraw <= balance) {
                balance = balance - withdraw;
                System.out.println("Money withdrawn successfully!!\nYour current balance is Rs " + balance);
            } else if (withdraw > balance) // handling special case..
                System.out.print("SORRY!! You don't have enough cash!! paisa kamao pehele... ");
        } else
            System.out.println("ja na beee chasma pehen ke aa.."); // handling invalid input..
    }

    public void Cash_Deposit() {
        System.out.print("Please enter your PIN: ");
        confirm_pin = input.nextInt();
        if (confirm_pin == pin) { // compairing pin..
            System.out.print("Access granted..\n");
            System.out.println("Enter the amount you want to deposit?");
            deposit = input.nextDouble(); // asking amount for deposit and storing in variable.
            balance = balance + deposit;
            System.out.print("Money deposited successfully!!\nYour current balance is Rs " + balance);
        } else
            System.out.print("Access Denied.."); // handling invalid input..
    }

    public void Check_Balance() {
        System.out.print("Please enter your PIN: ");
        confirm_pin = input.nextInt();
        if (confirm_pin == pin) // compairing pin..
            System.out.print("Access granted:\nYour balance is Rs " + balance);
        else
            System.out.print("Access Denied.."); // handling invalid input..
    }
}

class Team3 {
    public static void main(String args[]) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t\t\t\t\t IMPLEMENTATION OF BANK ATM USING INTERFACE AND ABSTRACT CLASS");
        System.out.println("1.> USER INFORMATION");
        System.out.println("2.> CHECK BALANCE");
        System.out.println("3.> CASH WITHDRAWAL");
        System.out.println("4.> CASH DEPOSIT\n");
        System.out.print("Enter the operation you want: ");
        choice = input.nextInt();
        Reserve_Bank rb1 = new Reserve_Bank();
        switch (choice) {
            case 1:
                rb1.Get_User_Information();
                break;
            case 2:
                rb1.Check_Balance();
                break;
            case 3:
                rb1.Cash_Withdrawal();
                break;
            case 4:
                rb1.Cash_Deposit();
                break;
            default:
                System.out.println("ERROR!! Enter valid choice..");
                break;
        }
    }
}