package lesson21;

public class AutoParkMain {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver
                ("LN-19548459");
        AutoBus bus = new AutoBus(busDriver, 25);
        System.out.println(bus.toString());

        BusDriver busDriver1 = new BusDriver
                ("AE-5353535");
        bus.setDriver(busDriver1);


        Passenger passenger = new Passenger("John");
        Passenger passenger1 = new Passenger("Margo");
        Passenger passenger2 = new Passenger("Peter");
        Passenger passenger3 = new Passenger("Hanna");
        Passenger passenger4 = new Passenger("Sebastian");

        bus.takePassenger(passenger);
        bus.takePassenger(passenger1);
        bus.takePassenger(passenger2);
        bus.takePassenger(passenger3);
        bus.takePassenger(passenger4);
        bus.takePassenger(new Passenger("Test"));

        //System.out.println(bus.getStringPassengersList());
        System.out.println(bus.toString());

    }
}
