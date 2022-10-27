package be.intecbrussel.cats;

public class TurkishVanCat extends Felis {

    public String nickname;

    public TurkishVanCat() {
    }

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo, String nickname) {
        super(name, age, shelterNo, badgeNo);
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "TurkishVanCat{" +
                super.toString() +
                "nickname='" + nickname + '\'' +
                '}';
    }

}
