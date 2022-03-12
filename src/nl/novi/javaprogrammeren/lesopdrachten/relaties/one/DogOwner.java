package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {
    /*
    [v] klasse DogOwner met de volgende instance variables:
    [v] name
    [v] sex
    [v] geen restricties op getters en setters.
    */

    private String nameOwner;
    private String sex;

    private Dog dogOwned;

    public DogOwner(String name, String sex) {
        this.nameOwner = name;
        this.sex = sex;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public String getSex() {
        return sex;
    }

    public Dog getDogOwned() {
        return dogOwned;
    }

    public void setDogOwned(Dog dogOwned) {
        this.dogOwned = dogOwned;
    }

    public void dogOneYearOlder() {
        dogOwned.setAge(dogOwned.getAge() + 1);
    }

    public void stelDogeVoor() {
        System.out.println(nameOwner + " heeft een " + getDogOwned().getSex() + ", deze is " + getDogOwned().getAge() + " jaar oud en van het soort: " + getDogOwned().getSpecies() + ". De hond heet: " + getDogOwned().getName());
    }
}
