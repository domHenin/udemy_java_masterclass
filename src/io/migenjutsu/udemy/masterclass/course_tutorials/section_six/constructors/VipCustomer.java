package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.constructors;

public class VipCustomer {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public VipCustomer() {
        this("Bulma", "bulma@capsulecorp.com");
        System.out.println("Empty Constructor call");
    }

    public VipCustomer(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;

        System.out.println("second constructor call");
    }

    public VipCustomer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;

        System.out.println("third constructor call.");

    }

//GETTERS:
    public String getName() { return name; }
    public String getEmailAddress() { return emailAddress; }
    public double getCreditLimit() { return creditLimit; }
}



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