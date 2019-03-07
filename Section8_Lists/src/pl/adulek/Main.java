package pl.adulek;

import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);
    private static Bank bank;

    public static void main(String[] args) {
	    program();
    }

    public static void program() {
        boolean resume = true;
        bank = new Bank();
        showActions();
        int decision;
        while (resume) {
            decision =  scanner.nextInt();
            switch (decision) {
                case 0:
                    resume = false;
                    System.out.println("Shutting down...");
                    scanner.close();
                    break;
                case 1:
                    showActions();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    addTransaction();
                    break;
                case 5:
                    bank.showCustomers();
                    break;
                default:
            }
        }
    }

    private static  void  addBranch() {
        int inx = bank.addNewBranch(new Branch());
        System.out.println("Branch " + inx + " was added");
    }

    private static void addCustomer() {
        System.out.println("Which branch does own the customer?");
        int branchNo = scanner.nextInt();
        scanner.nextLine();
        if(!bank.isBranchWithNumber(branchNo)) {
            System.out.println("There is no branch with number " + branchNo);
            return;
        }
        System.out.println("Customer name: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Please input the initial transaction");
        double iT = scanner.nextDouble();
        scanner.nextLine();
        bank.addCustomer(branchNo, name, iT);
    }

    private static void addTransaction() {
        System.out.println("Please input Customer name: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Please input the initial transaction");
        double iT = scanner.nextDouble();
        scanner.nextLine();
        bank.addTransaction(name, iT);
    }

    private static void showActions() {
        System.out.println("Choose your action by passing proper digit: \n" +
                "0. Quit\n" +
                "1. Show Actions\n" +
                "2. Add new Bank branch\n" +
                "3. Add customer\n" +
                "4. Add transaction\n" +
                "5. Show customers and their transactions\n");
    }
}
