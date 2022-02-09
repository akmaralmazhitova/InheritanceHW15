package com.company;

public class Programmer extends Person {

    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding() {System.out.println("Programmer loves codding.");}

    public void learn() {super.learn(); System.out.println(name + " leaning to make a website.");}

    public void walk() {super.walk();}

    public void eat() { super.eat(); }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                "} ";
    }
}