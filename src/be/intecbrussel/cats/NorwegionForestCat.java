package be.intecbrussel.cats;

public class NorwegionForestCat extends Felis {

    public NorwegionForestCat() {
    }

    public NorwegionForestCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    public void miauwInNorwegian() {
        System.out.println("Nordic mieeuww");
    }

    @Override
    public String toString() {
        return "NorwegionForestCat{" +
                super.toString() +
                '}';
    }

}
