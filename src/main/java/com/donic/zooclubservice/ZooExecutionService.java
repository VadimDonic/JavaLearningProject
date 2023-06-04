package com.donic.zooclubservice;

import java.sql.SQLOutput;

public class ZooExecutionService {
    public static void main(String[] args) {

        Animal charlieDog = new Dog("Charlie");

        System.out.println("Numele obiectului charlieDog este : " + charlieDog.getName());
        charlieDog.setName("Charlie Vaccined");
        System.out.println("Numele actualizad a lui charlieDog este : " + charlieDog.getName());

        charlieDog.eat();

        AnimalInterface rexDog = new Dog("Rex");
        rexDog.makeSound();

        Dog zikDog = new Dog("Zik");
        zikDog.eat();
        zikDog.makeSound();

        Cat arthasCat = new Cat("Arthas");
        arthasCat.eat();
        arthasCat.makeSound();

        Fox foxFire = new Fox("Firefox");
        foxFire.eat();
        foxFire.makeSound();

    }
}
