package com.donic.zooclubservice;

public class Fox extends Animal {

    public Fox(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats chicken ");

    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " ding ding! ");
    }

}
