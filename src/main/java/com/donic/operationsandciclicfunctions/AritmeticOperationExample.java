package com.donic.operationsandciclicfunctions;

public class AritmeticOperationExample {
    public static void main(String[] args) {
        int a = 43;
        int c = 3;

        //Sum
        int sum = a + c;
        System.out.println("Summary " + sum);
        System.out.println("Summary " + (a + c));

        //Substraction
        int sub = a - c;
        System.out.println("Result " + sub);

        //Multiplication
        int result = a * c;
        System.out.println("Multiplication " + result);

        //Devision
        result = a / c;
        System.out.println("Devision " + result);

        //The rest of devision or Devision with reminder
        result = a % c;
        System.out.println("Rest of Devision " + result);
    }
}
