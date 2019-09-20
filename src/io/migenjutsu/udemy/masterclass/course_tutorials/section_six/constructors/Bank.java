package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.constructors;

public class Bank {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;


//SETTERS:
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }


//GETTERS:
    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public int getPhoneNumber() { return phoneNumber; }

    public double depositFunds(double depositAmount) { return depositAmount + getBalance(); }

    public double withdrawFunds(double withdrawAmount) {
        if (getBalance() == 0) {
            return 0;
        } else { return getBalance() - withdrawAmount; }
    }
}
