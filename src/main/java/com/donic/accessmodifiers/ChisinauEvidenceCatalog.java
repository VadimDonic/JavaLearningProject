package com.donic.accessmodifiers;

import com.donic.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
//  Only 1 parameter constructor.
        Person andreiBuzu = new Person(345345345345L);
        andreiBuzu.address = "Alexandru Cel Bun 98/a";
        andreiBuzu.gender = "Masculin";
        andreiBuzu.setAge(28);
        System.out.println(andreiBuzu.toString());
        Person.printNumberOfPeople();

//  Multiple parameters constructor.
        Person gheorgeCosbuc = new Person(345345345545L, "Gheorge Cosbuc", false, 58);
        gheorgeCosbuc.address = "Alba-Iulia";
        gheorgeCosbuc.gender = "Masculin";
        System.out.println(gheorgeCosbuc.toString());
        Person.printNumberOfPeople();

        Person mihaiEminescu = new Person(34534534545L, "Mihai Eminescu", false, 37);
        mihaiEminescu.address = "Veronica Micle 24";
        mihaiEminescu.gender = "Masculin";
        mihaiEminescu.setAge(30);
        System.out.println(" Detaliile despre Mihai Eminescu sunt: " + mihaiEminescu.name + " cu genul " +
                mihaiEminescu.gender);
        System.out.println(mihaiEminescu.toString());
        Person.printNumberOfPeople();

        Person mariaBiesu = new Person(123124324L, "Maria Biesu", true, 50);
        mariaBiesu.address = "Deleanu";
        mariaBiesu.gender = "Feminin";
        System.out.println(mariaBiesu.toString());
        Person.printNumberOfPeople();

    }
}
