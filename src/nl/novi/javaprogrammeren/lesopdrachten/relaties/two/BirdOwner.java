package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BirdOwner {
    /*

    [v] Geef de klasse BirdOwner de volgende instance variables:
    [v] name,
    [v] sex.

    [v] Er zijn geen restricties op getters en setters.
    */

    private String name;
    private String sex;

    private static List<Bird> birds = new ArrayList<>();

    public BirdOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public List<Bird> getBirds() {
        return birds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void addBird(Bird bird) {

        Iterator<Bird> itr = birds.iterator();

        while (itr.hasNext()) {
            Bird birds = itr.next();

            if (bird.getNickName() != birds.getNickName()) {

            }
            if (bird.getNickName() == birds.getNickName()) {

                itr.remove();

            }
        }
        birds.add(bird);
    }


    public void killBirds () {

        
        
        
        
        List<Integer> manBird = new ArrayList<>();
        List<Integer> vrouwBird = new ArrayList<>();

        int[] winingMan = new int[5];
        int[] winingVrouw = new int[5];

        
        for (int i = 0 ; i < 5; i++){
            int lottery = (int) (Math.random() * birds.size());

            winingMan[i] = lottery;
        }

        for (int i = 0 ; i < 5; i++){
            int lottery = (int) (Math.random() * birds.size());

            winingVrouw[i] = lottery;
        }
        System.out.println(winingMan[0]);
        System.out.println(manBird);
        System.out.println(vrouwBird);

        Iterator<Bird> itr = birds.iterator();

        while (itr.hasNext()){
            Bird birds = itr.next();

            if(birds.getSex() == "man"){

                itr.remove();
            }
            if (birds.getSex() == "vrouw"){
                itr.remove();
            }

        }

    }

    public  void lotteryNumbers (){

    }

    public void printMyBirds() {

        Iterator<Bird> itr = birds.iterator();

        System.out.println("Mijn naam is " + name + " en dit zijn mijn vogels : ");

        while (itr.hasNext()) {
            Bird birds = itr.next();
            System.out.println("Vogel " + birds.getNickName() + " met ring nummer: " + birds.getRingNumber());

        }
    }


}
