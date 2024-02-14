package lesson21;

import java.util.Arrays;

public class AutoBus {
    // HAS-A
    private BusDriver driver; // argegation Leicht  connection
    private final AutoPilot autopilot;// komposition

    private int capacity;

    private final Passenger[] passengers;
    private int countPassender;


    public AutoBus(BusDriver busDriver, int capacity) {
        this.driver = busDriver;
        busDriver.setAutobus(this);
        autopilot = new AutoPilot("AP-005");
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        if (capacity > countPassender) {
            passengers[countPassender] = passenger;
            countPassender++;
            System.out.println("Пассажир зашел в автобус ");

            return true;

        } else {
            System.out.println("мест нет!!!Жди!!");
            return false;
        }
    }

    public AutoPilot getAutopilot() {
        return autopilot;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        driver.setAutobus(this);
        this.driver = driver;
    }



    public String getStringPassengersList() {
        StringBuilder sb = new StringBuilder("{");

        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                Passenger current = passengers[i];
                sb.append("{Passenger: " + " id: ").append(current.getId(
                )).append("; name: ").append(current.getName()).append("}");
                sb.append("; ");


            }

        }

        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();

    }
    public String toString() {
        //TODO


        StringBuilder sb = new StringBuilder("Autobus: {");
        sb.append("driver: ").append(driver.getLicenceNumber()).
                append("; autopilot: ").append(autopilot.
                        getSoftwareVersion()).append("}").append(getStringPassengersList());
        return sb.toString();

    }
}
