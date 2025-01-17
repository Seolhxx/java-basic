package oop1.ex;

public class Account {
    int balance;
    int amount;

    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    int withdraw(int amount) {
        balance -= amount;
        if (balance < amount) {
            System.out.println("잔액부족");
            System.out.println("잔고:" + balance);
        }
        return balance;
    }
}
