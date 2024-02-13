package lesson20;

public class SpecialBus extends Bus {

    private int bicyclePlaces;
    private int bicyclesCount;



    public SpecialBus(String model, int yearManufactured, int capacity, int bicyclePlaces) {
        super(model, yearManufactured, capacity);
        this.bicyclePlaces = bicyclePlaces;

    }

    public boolean takePassengerWithBicycle() {
        if (getBicyclesCount() < bicyclePlaces && getCountPassengers() < getCapacity()){
            countPassengers++;
            bicyclesCount++;
            System.out.println("Влез с велосипедом");
            return true;
        }else {
            System.out.println("не влез");
            return false;
        }

    }

    public int getBicyclePlaces() {
        return bicyclePlaces;
    }


    public int getBicyclesCount() {
        return bicyclesCount;
    }

    public int example() {
        return super.getCapacity();
    }

}
