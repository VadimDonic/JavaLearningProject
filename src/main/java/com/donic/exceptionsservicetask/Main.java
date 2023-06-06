package com.donic.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        int result1 = ArithmeticOperationService.divideIntNoExceptionHandling(10, 0);
        int result2 = ArithmeticOperationService.divideIntWithExceptionHandling(10, 0);
        System.out.println(result2);
        System.out.println(" The programm is running till the end ");

        String stringValue = "Gheorghe";
        String stringValue2 = null;
        System.out.println(TextManager.getTheTextLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLength(stringValue));
        System.out.println(TextManager.getTheTextLengthIfElse(stringValue2));

        String filePath = "src/main/java/com/donic/exceptionsservicetask/test6.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);

        } catch (IOException exceptionObject){
            System.out.println("File is not exist, the execution of the program is not interrupted");
        }finally {
            System.out.println("This block is always executed");
        }
        System.out.println("The program is running");

        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);
    }
}
