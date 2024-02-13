package lesson20.Homework019;

public class Clock {
    /*
    Написать как минимум одну иерархию классов в которой будет один родительский клас и два наследника,
     расширяющих его функционал
    Лучше придумать две такие иерархии
    У родительского класса должен быть метод создающий строку с информацией об объекте (метод String info())
     */
    private String nameModel;

    private int price;

    public Clock(String nameModel, int price) {
        this.nameModel = nameModel;
        this.price = price;
    }

    public String info() {
        return "Model " + nameModel + ". Price " + price;
    }
}
