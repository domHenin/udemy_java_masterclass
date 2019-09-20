package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.constructors;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.setBalance(100);
        System.out.println("Current Balance: $"+bank.getBalance());

        System.out.println("Deposit New Balance: $"+bank.depositFunds(5));

//        bank.withdrawFunds(10);
        System.out.println("Withdraw New Balance: $"+bank.withdrawFunds(10));


    }
}


//TODO:
// challenge:
// create a new class for a bank account
// create fields for the account number,
// balance, customer name, email and phone number
// ..
// create getters and setters for each field
// create two additional methods
// 1. to allow the customer to deposit funds (this should increment the balance field)
// 2. to allow the customer to withdraw funds. this should deduct from the balance field)
// but not allow the withdrawal to complete if there are insufficient funds.
// you will want to create various code in the Man class (the one created by Intellij) to confirm your code works
// Add some sout's in the two methods above as well