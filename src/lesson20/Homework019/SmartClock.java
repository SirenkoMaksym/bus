package lesson20.Homework019;

public class SmartClock extends ElektichenClock {
    private String welcheOP;

    private int zeitArbeitOhneStrom;

    public SmartClock(String nameModel, int price, int vieVielVerkauf, String wayOfBnutzen, String welcheOP, int zeitArbeitOhneStrom) {
        super(nameModel, price, vieVielVerkauf, wayOfBnutzen);
        this.welcheOP = welcheOP;
        this.zeitArbeitOhneStrom = zeitArbeitOhneStrom;
    }

    public static void main(String[] args) {
    ElektichenClock elclock = new ElektichenClock("BMW", 200, 15, "anDerWand");
        System.out.println(elclock.info());
    }
}
