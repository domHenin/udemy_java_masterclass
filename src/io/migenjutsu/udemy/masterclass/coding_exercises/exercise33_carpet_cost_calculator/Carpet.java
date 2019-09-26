package io.migenjutsu.udemy.masterclass.coding_exercises.exercise33_carpet_cost_calculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) { this.cost = cost; }

    public double getCost() {
        if (cost<0.0)
            return 0;
        else
            return cost;
    }
}
