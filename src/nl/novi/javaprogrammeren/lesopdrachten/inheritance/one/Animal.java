package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class Animal {
    /*
    [v] Supper:
    [v] name Beest
    [v] geslacht

    [v] Metode:
    [v] bewegen
    [v] geluid
    [v] slapen
    */

    private String name;
    private String sex;

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void move() {
        System.out.println("geen zin");
    }

    public void sound() {
        System.out.println("wat ben ik voor geluid?");
    }

    public void sleep() {
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzz");
    }

    public void eat(String feedDay) {
        System.out.println("when it's " + feedDay + " I eat my favorite food ");
    }
}
