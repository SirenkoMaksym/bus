package lesson22.HomeWork022.HWVenichle;

public class Vehicle {

public void startEngine() {

}

    public static void main(String[] args) {
       Car car = new Car();
       Bicycle bicycle = new Bicycle();
       Motorcycle motorcycle= new Motorcycle();

        Vehicle[] vehicle1s = {car, bicycle, motorcycle};

        for (int i = 0; i < vehicle1s.length; i++) {
            vehicle1s[i].startEngine();
        }
        }
    }

