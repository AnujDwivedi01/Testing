package com.assignment1;

class BankAccount {

    private int accountNumber;
    private String name;
    private double balance;

    BankAccount(int accNo, String name, double bal) {
        this.accountNumber = accNo;
        this.name = name;
        this.balance = bal;
    }

    void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance)
            throw new ArithmeticException("Insufficient balance");
        balance -= amount;
    }

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(101, "Anuj", 5000);

        try {
            acc.deposit(2000);
            acc.withdraw(1000);
            acc.display();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
