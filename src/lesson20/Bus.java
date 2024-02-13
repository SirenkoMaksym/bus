package lesson20;

public class Bus extends Vehicle {

    private int capacity;
    private int allesPassagiere;
    protected int countPassengers;




    public Bus(String model, int yearManufactured, int capacity) {

        super(model, yearManufactured);
        System.out.println("Конструктор Bus продолжает выполнение!");
        this.capacity = capacity;
        allesPassagiere=0;
    }



    public boolean takePassenger() {

        if (countPassengers < capacity) {

            countPassengers++;
            allesPassagiere++;
            System.out.println("Пассажир зашел в автобус " + this.getModel());
            return true;
        }

        System.out.println("Автобус полный! Пассажир не смог зайти");
        return false;
    }
    public int getAllesPassagiere() {
        return allesPassagiere;
    }

    public void getOutPassenger() {

        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса " + this.getModel());
        } else {
            System.out.println(" в автобусе нет пассажиров");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {

        this.capacity = capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}