public abstract class Vehicle {
    String make;
    String model;
    int year;
    String color;
    double fuelLevel;

    public Vehicle(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuelLevel = 100.0;
    }

    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();
}
