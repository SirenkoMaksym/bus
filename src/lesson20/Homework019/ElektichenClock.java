package lesson20.Homework019;

public class ElektichenClock extends Clock {

    private int vieVielVerkauf;

    private String wayOfBnutzen;

    public ElektichenClock(String nameModel, int price, int vieVielVerkauf,
                           String wayOfBnutzen) {
        super(nameModel, price);
        this.vieVielVerkauf = vieVielVerkauf;
        this.wayOfBnutzen = wayOfBnutzen;
    }

    public int getVieVielVerkauf() {
        return vieVielVerkauf;
    }

    public String getWayOfBnutzen() {
        return wayOfBnutzen;
    }
}
