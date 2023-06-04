package com.donic.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int divideIntNoExceptionHandling (int a, int b){
        return a / b;
    }

        public static int divideIntWithExceptionHandling (int a, int b){
        try{
            int result = a / b;
            return result;
        }catch (Exception capturedException){
            System.out.println(" An exception has occured: " + capturedException.getMessage());
            return 0;
        }
    }
}
