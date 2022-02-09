package com.company;

public class Dancer extends Person{

    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing(){
        System.out.println("She dancing national dance.");
    }

    public void learn() {super.learn();}

    public void walk() {super.walk();}

    public void eat() { super.eat();System.out.println(name + " eats many fruits.");}

    @Override
    public String toString() {
        return "Dancer{"  +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", groupName='" + groupName + '\''+
                '}';
    }
}


