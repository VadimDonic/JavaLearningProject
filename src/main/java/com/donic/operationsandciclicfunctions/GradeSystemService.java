package com.donic.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testresult = 98;

        if (testresult >= 90) {
            System.out.println("Calificatul A");
        }else if (testresult >= 80) {
            System.out.println("Calificatul B");
        } else if (testresult >= 70) {
            System.out.println("Calificatul C");
        }else if (testresult >= 60) {
            System.out.println("Calificatul D");
        }else {
            System.out.println("Un astfel de calitativ nu este definit");
        }

        System.out.println("Programul s-a terminat");
    }
}
