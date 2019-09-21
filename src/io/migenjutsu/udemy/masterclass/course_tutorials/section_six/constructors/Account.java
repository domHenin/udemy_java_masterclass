package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.constructors;

public class Account {

    private double balance;
    private String number;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this(2.50, "56789", "default Name", "default address", "default phone");

        System.out.println("Empty Constructor created.");
    }

    public Account(double balance, String number, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        setBalance(balance);
        setNumber(number);
        setCustomerName(customerName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public Account(String customerName, String email, String phoneNumber) { this(100.55, "99999", customerName, email, phoneNumber);    }

    //SETTERS:
    public void setNumber(String number) { this.number = number; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }


//GETTERS:
    public String getNumber() { return number; }
    public double getBalance() { return balance; }
    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    public void depositFunds(double depositAmount) { this.balance += depositAmount; }

    public void withdrawFunds(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Only "+this.balance+" available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of "+withdrawAmount+" processed. Remaining balance = "+this.balance);
        }
    }
}
