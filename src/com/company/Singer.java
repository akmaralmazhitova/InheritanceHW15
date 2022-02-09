package com.company;

public class Singer extends Person {
    String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;

    }

    public void singing() {
        System.out.println("He singing very well with gitar. That's why he is so popular gitar singer. ");
    }

    public void playGitar() {
        System.out.println("He cannot sing without his gitar.");
    }

    public void learn() {
        super.learn();
    }

    public void walk() {
        super.walk();
        System.out.println(name + " walks on foot after concert.");
    }

    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", bandName='" + bandName + '\'' +
                "} " ;
    }
}

