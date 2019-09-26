package io.migenjutsu.udemy.masterclass.coding_exercises.exercise33_carpet_cost_calculator;

public class Floor {
    private double width, length;

    public Floor(double width, double length) {
        if (width<0 || length<0) {
            this.width=0;
            this.length=0;
        } else if (width<0) {
            this.width=0;
            this.length=length;
        } else if (length<0) {
            this.width=width;
            this.length=0;
        } else {
            this.width=width;
            this.length=length;
        }
    }

    public double getArea() {
        double area = width * length;
        return area;
    }
}
