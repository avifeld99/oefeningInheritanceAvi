package be.intecbrussel.cats;

public class SiameseCat extends Felis {

    public SiameseCat() {
    }

    public SiameseCat(String name, int age) {
        super(name, age);
    }

    public SiameseCat(int shelterNo, int badgeNo) {
        super(shelterNo, badgeNo);
    }

    public SiameseCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "SiameseCat{" +
        super.toString() +
                '}';
    }

}
