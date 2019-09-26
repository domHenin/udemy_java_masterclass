package io.migenjutsu.udemy.masterclass.coding_exercises.exercise7_teen_number_checker;

public class App {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if (ageOne>=13 && ageOne<=19 || ageTwo>=13 && ageTwo<=19 ||ageThree>=13 && ageThree<=19) {
            return true;
        } else
            return false;
    }

//    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
//        return isTeen(ageOne) || isTeen(ageTwo) || isTeen(ageThree);
//    }
//
//    public static boolean isTeen(int a) {
//        return (a>=13 && a<=19);
//    }
}
