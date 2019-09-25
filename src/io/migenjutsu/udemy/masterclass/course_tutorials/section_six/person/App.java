package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person();


        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());

//TEST::
        person.setAge(-5);
        System.out.println(person.getAge());
    }
}
