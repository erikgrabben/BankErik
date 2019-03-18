import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcErik {

    private static List<Customer> customers;

    private static int WITHDRAWAL = 1;

    public static void main(String[] args) {

        customers = new ArrayList<>();

        Customer erikErgon = new Customer(100_000, "password");

        customers.add(erikErgon);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter PIN");
        int pin = keyboard.nextInt();
        int balance = 10_000;

        //int choice = keyboard.nextInt();

        if (pin == 1111) {
            System.out.println("Hello. Please enter 1 for withdrawal, 2 for deposit, 3 to display current balance.");
            int choice = keyboard.nextInt();

            if (choice == WITHDRAWAL) {
                System.out.println("Enter amount to withdraw: ");
                int withdrawal = keyboard.nextInt();
                int resultWithdraw = balance - withdrawal;
                if (resultWithdraw < 0 || choice > 2000) {
                    System.out.println("Withdrawal cannot exceed $2000. Balance cannot be reduced below $0.");
                } else {
                    System.out.println(choice + " has been withdrawn from your bank account.\nCurrent balance " + resultWithdraw + ".");
                }
            } else if (choice == 2) {
                System.out.println("Enter amount to deposit");
                int deposit = keyboard.nextInt();
                int resultDeposit = balance + deposit;
                System.out.println("Deposit successful.\nCurrent balance: " + "$" + resultDeposit + ".");

            } else if (choice == 3) {
                printBalance(balance);
            }
        }
    }
    public static void printBalance(int balance){
        System.out.println("Current balance: " + balance);
    }
}

