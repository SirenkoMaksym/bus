package lesson22.HomeWork022;

public class AmateurSportsman extends Human {
    int speed;
    int rest;

    public AmateurSportsman(String name) {
        super(name);
        this.speed = 15;
        this.rest = 10;
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getRest() {
        return rest;
    }
}
