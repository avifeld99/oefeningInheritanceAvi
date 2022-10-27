package be.intecbrussel.cats;

public class PersianCat extends Felis  {

    public PersianCat() {
    }

    public PersianCat(int shelterNo, int badgeNo) {
        super(shelterNo, badgeNo);
    }

    public PersianCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    @Override
    public void miauw() {
        super.miauw();
    }

    @Override
    public String toString() {
        return "PersianCat{" +
        super.toString() +
                '}';
    }

}
