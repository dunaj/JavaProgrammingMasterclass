package pl.adulek;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double initialTransaction) {
        if(findCustomer(name) == -1 && initialTransaction != 0) {
            Customer newCustomer = new Customer(name, initialTransaction);
            customers.add(newCustomer);
            return true;
        } else {
            System.out.println("There is already such customer or zero transaction is not allowed");
            return false;
        }
    }

    public boolean addTransaction(String name, double transaction) {
        if (transaction != 0) {
            int index = findCustomer(name);
            if(index >= 0) {
                customers.get(index).addTransaction(transaction);
                return true;
            }
            else {
                System.out.println("There is no customer called "+name);
            }
        }
        else {
            System.out.println("Transaction cannot be equal to zero");
        }
        return false;
    }

    public int findCustomer(String name) {
        for (int i = 0; i < customers.size(); ++i) {
            if(name.equals(customers.get(i).getName()))
                return i;
        }
        return -1;
    }

    public void showCustomers() {
        int i = 1;
        for (Customer c: customers) {
            System.out.println("\t" + i+1 + ". " + c.getName() + " \nTransactions of client: " );
            c.showTransactions();
            ++i;
        }

    }

}
