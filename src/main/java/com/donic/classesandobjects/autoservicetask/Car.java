package com.donic.classesandobjects.autoservicetask;

public class Car {

    int km;

    String gearType;

    String make;

    String model;

    int productionYear;

    double carPrice;

    String fuelType;

    String vinNumber;

    String plateNumber;

    public Car(String make, String model, int productionYear, String fuelType) {
        this.make = make ;
        this.model = model ;
        this.productionYear = productionYear ;
        this.fuelType = fuelType ;
        System.out.println("A fost creat un obiect de tip Car despre care cunoastem doar marca, model, anul producerii " +
                "si fuel type");
    }

    public Car(String vinNumber) {
        this.vinNumber = vinNumber;
        System.out.println("A fost creat un obiect de tip Car despre care cunoastem doar VIN-code" + this.vinNumber);

    }

}
