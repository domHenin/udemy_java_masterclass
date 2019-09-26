package io.migenjutsu.udemy.masterclass.coding_exercises.exercise32_point;

public class Point {

    private int x, y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point anotherPoint) {
        return distance(anotherPoint.x, anotherPoint.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

//    private int x;
//    private int y;
//
//
//    public Point() {
//        this(0,0);
//    }
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
////SETTERS:
//    public void setX(int x) { this.x = x; }
//    public void setY(int y) { this.y = y; }
//
////GETTERS:
//    public int getX() { return x; }
//    public int getY() { return y; }
//
//    public double distance() {
//        return distance(0,0);
//    }
//
//    public double distance(int x, int y) {
//        return Math.sqrt(this.x-x) * (this.x-x) * (this.y-y) * (this.y-y);
//    }
//
//    public double distance(Point anotherPoint) {
//        return distance(anotherPoint.x, anotherPoint.y);
//    }

}


//    How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
//
//        d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//
//        Where √ represents square root.