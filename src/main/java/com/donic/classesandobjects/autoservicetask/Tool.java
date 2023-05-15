package com.donic.classesandobjects.autoservicetask;

public class Tool {
    String name;

    boolean needElectricity;

    boolean isUsed;

    long uniqueCode;

    public Tool(String name) {
        this.name = name;
        System.out.println("Un obiect de tip tool a fost creat, numele lui este" + this.name);
    }

    public Tool() {
        System.out.println("O noua unelta a fost creata in cadrul programului. Nu dispunem despre detaliile ei" +
                "pentru detalii Numele este " + this.name + "iar unique code" + this.uniqueCode);
    }

}
