package lesson20.Homework019;

public class Clock {

    private String nameModel;

    private int price;

    private ZahlBlatClock zahlBlat;



    public Clock(String nameModel, int price, ZahlBlatClock zahlBlat) {
        this.nameModel = nameModel;
        this.price = price;
        this.zahlBlat= zahlBlat;

    }

    public String info() {
        return "Model " + nameModel + ". Price " + price
                + " Циферблат: " + zahlBlat.getName();
    }
}
