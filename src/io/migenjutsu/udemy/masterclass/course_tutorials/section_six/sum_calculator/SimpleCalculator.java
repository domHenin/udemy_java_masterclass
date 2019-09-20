package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.sum_calculator;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;



//SETTERS:
    public void setFirstNumber(double firstNumber) { this.firstNumber = firstNumber; }
    public void setSecondNumber(double secondNumber) { this.secondNumber = secondNumber; }

//GETTERS:
    public double getFirstNumber() { return firstNumber; }
    public double getSecondNumber() { return secondNumber; }

//LOGIC:
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
