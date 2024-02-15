package lesson22.HomeWork022;

public class Human {
    private String name;
    private int speed;
    private int rest;

    public Human(String name) {
        this.name = name;
        this.speed = 10;
        this.rest =15;
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
