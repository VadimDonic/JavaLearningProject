package com.donic.methodstask;

public class ExecutionService {
    public static void main(String[] args) {

        int randomInt = DataGeneratorUtil.getRandomInt(100, 150);
        System.out.println("Variabila randomInt: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila randomInt: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000);
        System.out.println("Variabila randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-1000);
        System.out.println("Variabila randomDouble: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1 " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2 " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 3 " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random String de X Chars:" + DataGeneratorUtil.generateValidRandomString(7));

        System.out.println("Random String de X Chars:" + DataGeneratorUtil.generateInvalidRandomString(7));

        Customer ionConsumer = new Customer("Ion Sirbu", 1222, "ion@gmail.com");
        System.out.println("Nume de obiect Ion: " + ionConsumer.getName());
        System.out.println("Virsta de obiect Ion: " + ionConsumer.getAge());
        System.out.println("Email de obiect Ion: " + ionConsumer.getEmail());

        ionConsumer.setName("Ion Brotacel");
        ionConsumer.setAge(28);
        ionConsumer.setEmail("ionbrotacel@gmail.com");

        System.out.println("Nume de obiect Ion: " + ionConsumer.getName());
        System.out.println("Virsta de obiect Ion: " + ionConsumer.getAge());
        System.out.println("Email de obiect Ion: " + ionConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateInvalidRandomString(12), DataGeneratorUtil.getRandomInt(127),
                DataGeneratorUtil.getRandomEmail());
        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(6));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(5, 64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());
    }

}
