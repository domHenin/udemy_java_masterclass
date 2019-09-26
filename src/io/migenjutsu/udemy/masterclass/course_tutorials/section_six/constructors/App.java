package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.constructors;


import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//
//        Account vegetasAccount = new Account(); //(0.00, "123", "Vegeta", "myemail@vegeta.com", "407.123.4567");
//
//
//        vegetasAccount.withdrawFunds(100);
//
//        vegetasAccount.depositFunds(50);
//        vegetasAccount.withdrawFunds(100);
//
//        vegetasAccount.depositFunds(51);
//        vegetasAccount.withdrawFunds(100);
//
//        Account gokusAccount = new Account("Goku", "goku@email.com", "123456");
//
//        System.out.println(gokusAccount.getNumber()+" name "+gokusAccount.getCustomerName());


////// git checkout -b rework_practice
//        VipCustomer bulma = new VipCustomer();
//        System.out.println(bulma.getName());
//
//        VipCustomer vegeta = new VipCustomer("Vegeta", 25000.00);
//        System.out.println(vegeta.getName());
//        System.out.println("Customer: "+vegeta.getName()+"'s Email Address: "+vegeta.getEmailAddress());
//
//        VipCustomer trunks = new VipCustomer("Trunks", 100.00, "trunks@email.com");
//        System.out.println(trunks.getName());
//        //test:
//        System.out.println(trunks.getEmailAddress());

//  PRACTICE:
        VipCustomer customerAaa = new VipCustomer();
        VipCustomer customerBbb = new VipCustomer("Vegeta", 100000);
        VipCustomer customerCcc = new VipCustomer("Trunks", "trunks@email.com", 3000000);
        System.out.println(customerAaa.toString());
        System.out.println(customerBbb.toString());
        System.out.println(customerCcc.toString());

//        //Person__
//        Person__ personFir = new Person__();
//        Person__ personSec = new Person__("Sasuke", "Uchiha");
//        Person__ personThir = new Person__("Obito", "Uchiha", "Madara");
//
//        System.out.println(personFir.toString());
//        System.out.println(personSec.toString());
//        System.out.println(personThir.toString());
//
    }
}

//QUESTION: why am i retyping the name of `personSec` when its done in the constructor?
//NOTE: i tried to place setter int the proper place in `this()`

//TODO:
// new challange:
// create a new class VipCustomer
// it should have 3 fields; name, credit limit, and email address
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.


//TODO:
// challenge: COMPLETE
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