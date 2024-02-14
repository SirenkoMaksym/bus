package lesson20.Homework019;

public class ElektichenClock extends Clock {

    private int vieVielVerkauf;

    private String wayOfBnutzen;

    private WayOfEnergy wayOfEnergy;

    public ElektichenClock(String nameModel, int price, int vieVielVerkauf,
                           String wayOfBnutzen, WayOfEnergy wayOfEnergy) {
        super(nameModel, price, new ZahlBlatClock("электронный"));
        this.vieVielVerkauf = vieVielVerkauf;
        this.wayOfBnutzen = wayOfBnutzen;
        this.wayOfEnergy = wayOfEnergy;
    }

    public int getVieVielVerkauf() {
        return vieVielVerkauf;
    }

    public String getWayOfBnutzen() {
        return wayOfBnutzen;
    }
}
