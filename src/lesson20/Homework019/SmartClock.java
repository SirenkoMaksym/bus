package lesson20.Homework019;

public class SmartClock extends ElektichenClock {
    private String welcheOP;

    private int zeitArbeitOhneStrom;

    private WelchrLadeGerat  welcheLadeGeerat;

    public SmartClock(String nameModel, int price, int vieVielVerkauf, String wayOfBnutzen,
                      String welcheOP, int zeitArbeitOhneStrom, WelchrLadeGerat welcheLadeGeerat) {
        super(nameModel, price, vieVielVerkauf, wayOfBnutzen, new WayOfEnergy("Akku"));
        this.welcheOP = welcheOP;
        this.zeitArbeitOhneStrom = zeitArbeitOhneStrom;
        this.welcheLadeGeerat= welcheLadeGeerat;
    }

    public static void main(String[] args) {
    ElektichenClock elclock = new ElektichenClock("BMW", 200, 15, "anDerWand",new WayOfEnergy("battary"));
        System.out.println(elclock.info());
    }
}
