package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.List;

public class MainBird {

    public static void main(String[] args) {

        BirdOwner rein = new BirdOwner("Rein", "man");

        Bird olaf = new Bird("olaf", "postduif", 1111,"man");
        Bird olaf2 = new Bird("olaf", "postduif", 1111,"man");
        Bird remco = new Bird("Remco", "straatduif", 3333,"man");
        Bird remon = new Bird("remon", "straatduif", 4444,"man");
        Bird tonie = new Bird("tonie", "straatduif", 5555,"man");
        Bird hazel = new Bird("hazel", "straatduif", 6666,"man");
        Bird toko = new Bird("toko", "straatduif", 7777,"man");
        Bird hoisin = new Bird("hoisin", "straatduif", 8888,"man");
        Bird slang = new Bird("slang", "straatduif", 9999,"man");
        Bird neus = new Bird("neus", "straatduif", 1010,"man");
        Bird donie = new Bird("donie", "straatduif", 2020, "vrouw");
        Bird bumbel = new Bird("bumbel", "straatduif", 3030,"vrouw");
        Bird schaak = new Bird("schaak", "straatduif", 4040,"vrouw");
        Bird pen = new Bird("pen", "straatduif", 5050,"vrouw");
        Bird tellie = new Bird("tellie", "straatduif", 6060,"vrouw");
        Bird toma = new Bird("toma", "straatduif",  7070,"vrouw");
        Bird ramon = new Bird("ramon", "straatduif", 8080,"vrouw");
        Bird tazie = new Bird("tazie", "straatduif", 9090,"vrouw");
        Bird romie = new Bird("romie", "straatduif", 10101,"vrouw");
        Bird apple = new Bird("apple", "straatduif", 10202,"vrouw");

        System.out.println("____________vogels toevoegen__________");
        rein.addBird(olaf);
        rein.addBird(olaf2);
        rein.addBird(remco);
        rein.addBird(remon);
        rein.addBird(tonie);
        rein.addBird(hazel);
        rein.addBird(toko);
        rein.addBird(hoisin);
        rein.addBird(slang);
        rein.addBird(neus);
        rein.addBird(donie);
        rein.addBird(bumbel);
        rein.addBird(schaak);
        rein.addBird(pen);
        rein.addBird(tellie);
        rein.addBird(toma);
        rein.addBird(ramon);
        rein.addBird(tazie);
        rein.addBird(romie);
        rein.addBird(apple);

        System.out.println("____________vogels voorstellen________");
        rein.printMyBirds();

        System.out.println("____________nieuwe vogel stand_________");
        rein.killBirds();

        rein.printMyBirds();
    }
    /*
    Programmeer de volgende relatie.

    [v] Een BirdOwner kan een oneindig aantal vogels hebben.
    [v] Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    [v] Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    [v] Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
        serienummer.

    Uitdagend:
    [v] Zorg ervoor dat de BirdOwner minimaal 20 Bird-objecten heeft.
    [] De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
        Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */
}
