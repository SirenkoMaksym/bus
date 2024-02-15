package lesson22.HomeWork022;

public class Human {
    private String name;
    private int speed=10;
    private int rest =15;

    public Human(String name) {
        this.name = name;
        this.speed = speed;
        this.rest = rest;
    }

    public void run() {
        System.out.println(name + " Run mit speed " + getSpeed()+ "km/h " + "Ich muss schlafen: " + getRest());
    }

    public int getSpeed() {
        return speed;
    }

    public int getRest() {
        return rest;
    }
}
