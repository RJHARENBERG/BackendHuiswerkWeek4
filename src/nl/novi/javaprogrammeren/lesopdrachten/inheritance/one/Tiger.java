package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Tiger extends ZooAnimal {

//     [v] Ook willen we het aantal strepen weten.
    int numberOfStripes;


    public Tiger(String name, String sex,String cage, String feedDay, String countryOfOrigin, int numberOfStripes) {
        super(name, sex,cage, feedDay, countryOfOrigin);
        this.numberOfStripes = numberOfStripes;
    }
}
