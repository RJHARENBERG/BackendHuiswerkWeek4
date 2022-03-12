package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Pet extends Animal {
    /*
    [v] Huisdier:
    [v] naam baasje
    [v] favoriete voetsel merk
    [v] ras
    */

    private String nameOwner;
    private String favoriteFootBrand;
    private String race;

    public Pet(String name, String sex, String nameOwner, String favoriteFootBrand, String race) {
        super(name, sex);
        this.nameOwner = nameOwner;
        this.favoriteFootBrand = favoriteFootBrand;
        this.race = race;
    }

    @Override
    public void move() {
        System.out.println("ik ben een lui huis dier en beweeg 0.25");
    }
}
