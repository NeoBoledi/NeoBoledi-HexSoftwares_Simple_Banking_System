package simpleBankSystem;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Create a customer and a bank account
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter an account number: ");
	        String accountNumber = scanner.nextLine();

	        System.out.print("Enter an initial balance: ");
	        double initialBalance = scanner.nextDouble();

	        Customer customer = new Customer(name, accountNumber, initialBalance);
	        System.out.println("Account created successfully!");

	        // Menu for user interaction
	        while (true) {
	            System.out.println("\n--- Banking System Menu ---");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    customer.showBalance();
	                    break;
	                case 2:
	                    System.out.print("Enter the amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    customer.depositToAccount(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter the amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    customer.withdrawFromAccount(withdrawAmount);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the banking system. Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }
	    }

}
