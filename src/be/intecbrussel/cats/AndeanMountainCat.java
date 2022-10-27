package be.intecbrussel.cats;

public class AndeanMountainCat extends Felis {


    public void miauw(String customSound) {
        System.out.println("miauuww DEADDD!");
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String toString() {
        return "AndeanMountainCat{" +
                super.toString() +
                '}';
    }

}
