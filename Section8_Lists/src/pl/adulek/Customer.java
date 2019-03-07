package pl.adulek;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<Double>();
    }

    public Customer(String name, Double initialTransaction) {
        this.name = name;
        transactions = new ArrayList<Double>();
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }

    public void showTransactions() {
        for (int i = 0; i < transactions.size();++i) {
            System.out.println("\t\t"+ i + ". " + transactions.get(i));
        }
    }
}
