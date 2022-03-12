package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwnerMain {
    public static void main(String[] args) {

        Dog flufie = new Dog("Flufie", "Labrador", 3, "teef");
        Dog rover = new Dog("rover", "tekel", 2, "reu");
        DogOwner goof = new DogOwner("Goof", "man");

        System.out.println("____________doge aan owner toe wijzen__--");
        goof.setDogOwned(flufie);

        System.out.println(goof.getDogOwned().getName());
        System.out.println(goof.getDogOwned().getSpecies());

        System.out.println("_____________naam wijzigen_______________");
        goof.getDogOwned().setName("Dolf");
        System.out.println(goof.getDogOwned().getName());

        System.out.println("______________leeftijd +1 jaar___________");
        System.out.println(goof.getDogOwned().getAge());
        goof.dogOneYearOlder();
        System.out.println(goof.getDogOwned().getAge());

        System.out.println("______________hond voor stellen___________");
        goof.stelDogeVoor();
    }

    /*
    Programmeer de volgende relatie:
    [v] Een DogOwner kan maximaal 1 Dog hebben.
    [v] De DogOwner is in dit geval de eigenaar.

    De DogOwner-klasse moet methodes bevatten:
    [v] de naam van de hond aan te passen
    [v] de leeftijd met 1 te verhogen.

    [v] Geef de DogOwner een toString()-methode en druk dit af:
        NAAM-DogOwner heeft een reu/teef, deze is xx jaar oud en van het soort: SOORT-Dog. De hond heet: NAAM-Dog

    [v] Instantieer in de main de objecten en laat zien dat je code werkt.
     */
}
