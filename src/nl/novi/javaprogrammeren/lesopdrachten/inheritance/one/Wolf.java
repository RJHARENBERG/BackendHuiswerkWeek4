package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Wolf extends ZooAnimal {
    /*
    [v] Ook willen we de naam van de roedel weten.
    */

    private String packName;

    public Wolf(String name, String sex, String cage, String feedDay, String countryOfOrigin, String packName) {
        super(name, sex, cage, feedDay, countryOfOrigin);
        this.packName = packName;
    }

    @Override
    public void sound() {
        System.out.println("AAAAUUUUUWWWWWWW!!!!!!!");
    }
}
