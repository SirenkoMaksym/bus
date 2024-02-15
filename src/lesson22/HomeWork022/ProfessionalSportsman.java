package lesson22.HomeWork022;

public class ProfessionalSportsman extends AmateurSportsman{

    int speed = 25;
    int rest = 5;

    public ProfessionalSportsman(String name) {
        super(name);
        this.speed = speed;
        this.rest = rest;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getRest() {
        return rest;
    }

    @Override
    public void run() {
        super.run();
    }
}
