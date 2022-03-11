package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class Animal {
//    [v] Supper:
//    [v] name Beest
//    [v] geslacht

//    Metode:
//    bewegen
//    geluid
//    slapen

    private String name;
    private String sex;

    public Animal(String name, String sex){
        this.name = name;
        this.sex = sex;

    }


    public Animal() {

    }

    public void move (){}

    public void sound (){}

    public void sleep (){
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzz");
    }



}
