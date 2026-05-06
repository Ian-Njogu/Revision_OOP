public class Motorcycle extends Vehicle{
    boolean hasSideCar;
    String type;

    public Motorcycle(String make, String model, int year, String color, String type){
        super(make, model, year, color);
        this.type = type;
        this.hasSideCar = false;
    }

    @Override
    public  void accelerate(){
        System.out.println("Motorcycle " + make + " " + model + " revs the engine and speeds up!");
        fuelLevel -= 3.0;
    }

    @Override
    public void stop(){
        System.out.println("Motorcycle " + make + " " + model + " applies brakes and comes to a stop.");
    }

    @Override
    public void gas(){
        System.out.println("Refueling motorcycle " + make + " " + model + "...");
        fuelLevel = 100.0;
        System.out.println("Fuel level restored to 100%.");
    }
}
