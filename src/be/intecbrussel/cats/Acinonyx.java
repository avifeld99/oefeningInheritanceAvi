package be.intecbrussel.cats;

public class Acinonyx extends Animal {

    private double speed;

    public void run(double distance) {
    }

    public void kiauuww() {
        System.out.println("kiauuww!");
    }

    @Override
    public String toString() {
        return "Acinonyx{" +
                "speed=" + speed +
                '}';
    }

}
