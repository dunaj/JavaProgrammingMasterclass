package pl.adulek;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public int addNewBranch(Branch newBranch) {
        int idx = branches.size();
        branches.add(newBranch);
        return idx;
    }

    public boolean isBranchWithNumber(int idx) {
        return !(idx < 0 || idx >= branches.size());
    }

    public void addCustomer(int branchNo, String name, double initialTransaction) {
        if (branchNo < 0 || branchNo >= branches.size()) {
            System.out.println("Improper branch number");
            return;
        }
        if (branches.get(branchNo).addCustomer(name, initialTransaction)) {
            System.out.println("New Customer "+ name+ " was added to branch "+branchNo +
                    "with Initial Transaction equal to " + initialTransaction);
        }
    }

    public void showCustomersOfBranch(int index) {
        System.out.println("Customers of branch "+index+": ");
        branches.get(index).showCustomers();
    }

    public void addTransaction(String name, double transaction) {
        if(transaction==0) {
            System.out.println("Transactions equal to 0 are not allowed, not added");
            return;
        }
        for (Branch b : branches) {
            int idx = b.findCustomer(name);
            if (idx!=-1) {
                b.addTransaction(name, transaction);
            }
        }
        System.out.println("Customer was not found an all of the system");
    }

    public void showCustomers() {
        for(int i =0; i< branches.size(); i++)
            showCustomersOfBranch(i);
    }
}
