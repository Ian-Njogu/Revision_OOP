// d. SportsCar class using Interface Automobile and Abstract Class Vehicle
public class SportsCar extends Vehicle implements Automobile {
    private int currentGear;
    private boolean turboEnabled;
    private double currentSpeedKmh;
    private static final double SPORTS_MAX_SPEED = 320.0; // Sports cars go faster

    public SportsCar(String make, String model, int year, String color) {
        super(make, model, year, color);
        this.currentGear = 1;
        this.turboEnabled = false;
        this.currentSpeedKmh = 0.0;
    }

    // Implementing abstract methods from Vehicle
    @Override
    public void accelerate() {
        currentSpeedKmh += 40.0; // Sports cars accelerate faster
        fuelLevel -= 4.0;
        System.out.println("Sports car " + make + " " + model + " ROARS to " + currentSpeedKmh + " km/h!");
    }

    // Overloaded accelerate
    public void accelerate(double kmhIncrease) {
        currentSpeedKmh = Math.min(currentSpeedKmh + kmhIncrease, SPORTS_MAX_SPEED);
        fuelLevel -= (kmhIncrease * 0.15);
        System.out.println(make + " " + model + " accelerated to " + currentSpeedKmh + " km/h.");
    }

    @Override
    public void stop() {
        System.out.println(make + " " + model + " screeches to a halt from " + currentSpeedKmh + " km/h!");
        currentSpeedKmh = 0.0;
        currentGear = 1;
    }

    @Override
    public void gas() {
        System.out.println("High-performance refuel for " + make + " " + model + "...");
        fuelLevel = 100.0;
    }

    // Implementing Automobile interface
    @Override
    public void steer(String direction) {
        System.out.println(make + " " + model + " precision-steers " + direction + ".");
    }

    @Override
    public void shiftGear(int gear) {
        if (gear >= 1 && gear <= 7) { // Sports cars can have 7 gears
            currentGear = gear;
            System.out.println("Gear paddle-shifted to: " + currentGear);
        }
    }

    @Override
    public void activateAirbags() {
        System.out.println("Multi-airbag system deployed in " + make + " " + model + "!");
    }

    @Override
    public boolean checkSeatbelts() {
        System.out.println("Racing harness check: OK");
        return true;
    }

    public void activateTurbo() {
        turboEnabled = true;
        System.out.println("TURBO BOOST ACTIVATED on " + make + " " + model + "!");
        currentSpeedKmh += 60.0;
        fuelLevel -= 8.0;
    }

    public double getCurrentSpeedKmh() { return currentSpeedKmh; }
    public boolean isTurboEnabled() { return turboEnabled; }
}