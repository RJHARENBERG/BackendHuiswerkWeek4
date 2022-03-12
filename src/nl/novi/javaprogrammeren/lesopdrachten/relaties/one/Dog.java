package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class Dog {
    /*
    [v] klasse Dog met de volgende instance variables:
    [v] name
    [v] species
    [v] age
    [v] sex

    [v] Datatypes mag je zelf verzinnen.
    [v] De sex en species variables mogen na instantiatie niet meer aangepast worden.
    */

    private String name;
    private String species;
    private int age;
    private String sex;

    public Dog(String name, String species, int age, String sex) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
