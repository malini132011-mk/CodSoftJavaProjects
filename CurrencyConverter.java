import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result;

        if (choice == 1) {
            double rate = 83.50;
            result = amount * rate;
            System.out.println("Converted Amount: ₹" + result);
        } else if (choice == 2) {
            double rate = 83.50;
            result = amount / rate;
            System.out.println("Converted Amount: $" + result);
        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
} 