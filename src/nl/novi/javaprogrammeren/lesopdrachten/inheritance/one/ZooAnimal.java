package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class ZooAnimal extends Animal {

//    [v] dierentuin:
//    [v] naam hok
//    [v] voeder dag
//    [v] land van herkoms

    private String cage;
    private String feedDay;
    private String countryOfOrigin;


    public ZooAnimal(String name, String sex, String cage, String feedDay, String countryOfOrigin) {
        super(name, sex);
        this.cage = cage;
        this.feedDay = feedDay;
        this.countryOfOrigin = countryOfOrigin;
    }


}
