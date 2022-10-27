package be.intecbrussel.cats;

public class Animal {

    protected static int animalCount;
    {
        animalCount++;
    }
    private char size;
    private char coat;
    private String color;
    private double weight;


    public void makeNoise(String sound) {
        System.out.println("general loud sound");
    }

    public void eat() {

    }

    public void sleep() {

    }

    public boolean isAlive() {
        return true;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

}
