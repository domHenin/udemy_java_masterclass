package io.migenjutsu.udemy.masterclass.course_tutorials.section_six.classes_partOne;

public class App {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

//        porsche.setModel("Carrera");

//TEST:
        porsche.setModel("911");

        System.out.println("Model is: "+porsche.getModel());

    }
}
