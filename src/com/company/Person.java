package com.company;

public class Person {
    String name;
    String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn(){System.out.println("Person wants to learn everything.");}
    public void walk(){
        System.out.println("Person cannot walk without a stick.");
    }
    public void eat(){System.out.println("Person loves to eat a cake.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

