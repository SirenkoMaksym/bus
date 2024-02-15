package lesson22.HomeWork022;

public class ProfessionalSportsman extends AmateurSportsman{

    int speed ;
    int rest ;

    public ProfessionalSportsman(String name) {
        super(name);
        this.speed = 25;
        this.rest = 5;
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
