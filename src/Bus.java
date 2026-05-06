public class Bus extends Vehicle {
    private int passengerCapacity;
    private int currentPassengers;
    private String route;

    public Bus(String make, String model, int year, String color, int passengerCapacity, String route) {
        super(make, model, year, color);
        this.passengerCapacity = passengerCapacity;
        this.currentPassengers = 0;
        this.route = route;
    }


    @Override
    public void accelerate() {
        System.out.println("Bus on route " + route + " accelerates gradually with " + currentPassengers + " passengers on board.");
        fuelLevel -= 5.0; // Buses consume more fuel
    }

    @Override
    public void stop() {
        System.out.println("Bus on route " + route + " slows down and stops at the next bus stop.");
    }

    @Override
    public void gas() {
        System.out.println("Bus " + make + " " + model + " is being refueled at the depot...");
        fuelLevel = 100.0;
        System.out.println("Bus fuel level restored to 100%.");
    }
    public void boardPassenger() {
        if (currentPassengers < passengerCapacity) {
            currentPassengers++;
            System.out.println("Passenger boarded. Passengers: " + currentPassengers + "/" + passengerCapacity);
        } else {
            System.out.println("Bus is full! No more passengers allowed.");
        }
    }

    public void alightPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--;
            System.out.println("Passenger alighted. Passengers: " + currentPassengers + "/" + passengerCapacity);
        }
    }

    public int getPassengerCapacity() { return passengerCapacity; }
    public int getCurrentPassengers() { return currentPassengers; }
    public String getRoute() { return route; }
}
