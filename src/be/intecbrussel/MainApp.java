package be.intecbrussel;

import be.intecbrussel.cats.*;

public class MainApp {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Felis felis = new Felis();
        NorwegionForestCat norwegionFC1 = new NorwegionForestCat();
        NorwegionForestCat norwegionFC2 = new NorwegionForestCat();
        SiameseCat siameseCat = new SiameseCat("Sam", 6, 1000, 543);
        PersianCat persianCat = new PersianCat("Persi", 8, 333, 543);
        TurkishVanCat turkishVC = new TurkishVanCat("Persi", 8, 333, 543,
                "Turkey");
        AndeanMountainCat andeanMC = new AndeanMountainCat();

        Felis[] allFelises = {felis, norwegionFC1, norwegionFC2, siameseCat, persianCat, turkishVC,
                andeanMC};

        for (Felis a : allFelises) {
            System.out.println(a);
        }

        /*for (int index = 0; index < allFelises.length; index++) {
            System.out.println(allFelises[index]);
        }*/

        System.out.println(andeanMC.isAlive());
        System.out.println(felis.isAlive());
        System.out.println(Felis.getNoOfVaccinatedCats());

        System.out.println(persianCat.hashCode());
        System.out.println(siameseCat.hashCode());
        System.out.println(persianCat.equals(siameseCat));

        System.out.println(Animal.getAnimalCount());

        siameseCat.setBadgeNo(1000);
    }

}
