package com.company;

public class Main {

    public static void main(String[] args) {

        Person pr = new Person("Osmon", "Boss");
        System.out.println(pr.toString());

        Programmer prog = new Programmer("Azamat", "backend developer", "Google");
        System.out.println(prog.toString());
        prog.coding();
        prog.learn();

        Dancer dc = new Dancer("Anara", "national dancer", "Kara Jorgo");
        System.out.println(dc.toString());
        dc.dancing();
        dc.eat();

        Singer sing = new Singer("Kanat", "Pop singer", "Beatles");
        System.out.println(sing.toString());
        sing.singing();
        sing.playGitar();
        sing.walk();
    }
}
