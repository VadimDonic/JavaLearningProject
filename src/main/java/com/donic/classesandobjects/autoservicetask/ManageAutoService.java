package com.donic.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
//        Declararea si initializarea obiectelor folosind toate tipurile de constructori

        Car mercedesBenzSeriaC = new Car(" mercedes " , " c-class " , 2012, " Diesel ");
        mercedesBenzSeriaC.km = 18000 ;
        mercedesBenzSeriaC.carPrice = 10000 ;
        mercedesBenzSeriaC.gearType = " automatical " ;

        System.out.println(" Automonilul: " + mercedesBenzSeriaC.make + " modelul " + mercedesBenzSeriaC.model +
                " anul producerii " + mercedesBenzSeriaC.productionYear + " pe " + mercedesBenzSeriaC.fuelType +
                " ca are parcurs " + mercedesBenzSeriaC.km + " cu pretul " + mercedesBenzSeriaC.carPrice +
                " cu cutia " + mercedesBenzSeriaC.gearType);


        Car audiA5Quattro = new Car("WAUZZZ89822138922");
        audiA5Quattro.gearType = "automatical";
        audiA5Quattro.plateNumber = "SMA311";
        audiA5Quattro.carPrice = 10000;
        audiA5Quattro.fuelType = "benzin";
        audiA5Quattro.productionYear = 2012;
        audiA5Quattro.model = "A5";
        audiA5Quattro.make = "Audi";


        System.out.println(" Automobil cu VinCod: " + audiA5Quattro.vinNumber + " cu cutia " + audiA5Quattro.gearType +
                " cu pretul " + audiA5Quattro.carPrice + " care consuma " + audiA5Quattro.fuelType + " anul producerii " +
                audiA5Quattro.productionYear + " model " + audiA5Quattro.model + " marca " + audiA5Quattro.make);


        Tool ciocan = new Tool("Ciocan");
        ciocan.uniqueCode = 123124;
        System.out.println(" Numele si numarul de instrument este " + ciocan.name + " cu numarul uniq " + ciocan.uniqueCode);

        Tool elevator = new Tool();
        System.out.println( " Fara Parametri ");


        Garage autohub = new Garage("AutoHub", "str.Alba-Iulia 188/1",
                true, 25, 12334567, "luni-miercuri");
        System.out.println( " A fost deschis un garaj care se numeste " + autohub.name + " pe ardesa " + autohub.address +
                " care are diagnostica " + autohub.hasComputerDiagnostics + " cu capacitatea masini " + autohub.carCapacity +
                " numarul de ID " + autohub.numberID + " cu orarul de lucru " + autohub.schedule);


        Worker igor = new Worker();


    }
}
