package lesson22.HomeWork022;

public class AmateurSportsman extends Human {
    int speed = 15;
    int rest = 10;

    public AmateurSportsman(String name) {
        super(name);
        this.speed = speed;
        this.rest = rest;
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
