package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Lion extends ZooAnimal {

    //     [v] hoeveelheid kinderen.
    private int numberOfCubs;

    public Lion(String name, String sex, String cage, String feedDay, String countryOfOrigin, int numberOfCubs) {
        super(name, sex, cage, feedDay, countryOfOrigin);
        this.numberOfCubs = numberOfCubs;
    }


}
