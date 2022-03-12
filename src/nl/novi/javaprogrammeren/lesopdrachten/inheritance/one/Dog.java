package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Dog extends Pet {

    public Dog(String name, String sex, String nameOwner, String favoriteFootBrand, String race) {
        super(name, sex, nameOwner, favoriteFootBrand, race);
    }

    @Override
    public void sound() {
        System.out.println("Woef Woef!");
    }
}

