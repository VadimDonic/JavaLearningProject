package com.donic.classesandobjects.autoservicetask;

public class Garage {
    String name ;

    String address;

    boolean hasComputerDiagnostics;

    int carCapacity;

    int numberID;

    String schedule;

    public Garage(String name, String address, boolean hasComputerDiagnostics, int carCapacity, int numberID, String schedule) {
        this.name = name ;
        this.address = address ;
        this.hasComputerDiagnostics = hasComputerDiagnostics ;
        this.carCapacity = carCapacity ;
        this.numberID = numberID ;
        this.schedule = schedule ;
        System.out.println(" In cazul acesta toate parametrele sunt incluse.");
    }

}
