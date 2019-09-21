package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.constructors;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Account vegetasAccount = new Account(); //(0.00, "123", "Vegeta", "myemail@vegeta.com", "407.123.4567");


        vegetasAccount.withdrawFunds(100);

        vegetasAccount.depositFunds(50);
        vegetasAccount.withdrawFunds(100);

        vegetasAccount.depositFunds(51);
        vegetasAccount.withdrawFunds(100);

        Account gokusAccount = new Account("Goku", "goku@email.com", "123456");

        System.out.println(gokusAccount.getNumber()+" name "+gokusAccount.getCustomerName());

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