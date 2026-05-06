// d. Sedan class using Interface Automobile and Abstract Class Vehicle
public class Sedan extends Vehicle implements Automobile {
    private int currentGear;
    private boolean airbagsDeployed;
    private boolean seatbeltsOn;
    private double currentSpeedKmh;

    public Sedan(String make, String model, int year, String color) {
        super(make, model, year, color);
        this.currentGear = 1;
        this.airbagsDeployed = false;
        this.seatbeltsOn = true;
        this.currentSpeedKmh = 0.0;
    }

    @Override
    public void accelerate() {
        currentSpeedKmh += 20.0;
        fuelLevel -= 2.0;
        System.out.println(make + " " + model + " accelerates to " + currentSpeedKmh + " km/h.");
    }

    // Method Overloading: accelerate with a specific amount
    public void accelerate(double kmhIncrease) {
        if (currentSpeedKmh + kmhIncrease > max_speed) {
            System.out.println("Cannot exceed max speed of " + max_speed + " km/h!");
            currentSpeedKmh = max_speed;
        } else {
            currentSpeedKmh += kmhIncrease;
            fuelLevel -= (kmhIncrease * 0.1);
        }
        System.out.println(make + " " + model + " accelerated by " + kmhIncrease + " km/h. Current speed: " + currentSpeedKmh + " km/h.");
    }

    // Method Overloading: accelerate with speed and gear
    public void accelerate(double kmhIncrease, int targetGear) {
        shiftGear(targetGear);
        accelerate(kmhIncrease);
        System.out.println("Gear shifted to " + currentGear + " during acceleration.");
    }

    @Override
    public void stop() {
        System.out.println(make + " " + model + " brakes and stops from " + currentSpeedKmh + " km/h.");
        currentSpeedKmh = 0.0;
        currentGear = 1;
    }

    @Override
    public void gas() {
        System.out.println("Refueling " + make + " " + model + " at the petrol station...");
        fuelLevel = 100.0;
        System.out.println("Fuel level restored to 100%.");
    }

    // --- Implementing methods from Automobile interface ---

    @Override
    public void steer(String direction) {
        System.out.println(make + " " + model + " steers " + direction + ".");
    }

    @Override
    public void shiftGear(int gear) {
        if (gear >= 1 && gear <= 6) {
            currentGear = gear;
            System.out.println("Gear shifted to: " + currentGear);
        } else {
            System.out.println("Invalid gear! Must be between 1 and 6.");
        }
    }

    @Override
    public void activateAirbags() {
        if (!airbagsDeployed) {
            airbagsDeployed = true;
            System.out.println("AIRBAGS DEPLOYED for " + make + " " + model + "!");
        } else {
            System.out.println("Airbags already deployed.");
        }
    }

    @Override
    public boolean checkSeatbelts() {
        System.out.println("Seatbelts status: " + (seatbeltsOn ? "Fastened ✓" : "Not fastened ✗"));
        return seatbeltsOn;
    }

    // Getters
    public int getCurrentGear() { return currentGear; }
    public double getCurrentSpeedKmh() { return currentSpeedKmh; }
    public boolean isAirbagsDeployed() { return airbagsDeployed; }
}