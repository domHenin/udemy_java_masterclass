package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.sum_calculator;

public class App {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = "+calculator.getAdditionResult());
        System.out.println("subtraction = "+calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiplication = "+calculator.getMultiplicationResult());
        System.out.println("multiplication = "+calculator.getDivisionResult());


    }
}
