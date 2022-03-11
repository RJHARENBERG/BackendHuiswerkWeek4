package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Cat extends Pet{
//   [v] Ook willen we weten of het een binnen of buitenkat is.
    boolean houseCate;
    boolean outdoorsCat;


    public Cat(String name, String sex,String nameOwner, String favoriteFootBrand, String race, boolean houseCate, boolean outdoorsCat) {
        super(name, sex, nameOwner, favoriteFootBrand, race);
        this.houseCate = houseCate;
        this.outdoorsCat = outdoorsCat;
    }
}
