package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class Bird {
    /*    [] Geef de klasse Bird de volgende instance variables:
    [v] nickname,
    [v] species,
    [v] ringNumber

    [v] De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.
    */

    private String nickName;
    private String species;
    private int ringNumber;
    private String sex;

    public Bird (String nickName, String species, int ringNumber, String sex){
        this.nickName = nickName;
        this.species = species;
        this.ringNumber = ringNumber;
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public String getSpecies() {
        return species;
    }

    public int getRingNumber() {
        return ringNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String toString(){
        return getNickName() + " " + getSpecies() + " " + getRingNumber() + "\n";
    }
}
