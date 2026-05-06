// e. Main class demonstrating method overloading and overriding using accelerate()
public class Main {

    public static void main(String[] args) {



        Sedan mySedan = new Sedan("Toyota", "Corolla", 2022, "Silver");
        
        System.out.println("=== METHOD OVERRIDING Demo ===");
        System.out.println("Calling accelerate() via a Vehicle reference (polymorphism):");

        Vehicle vehicleRef = mySedan; // Upcasting to Vehicle
        vehicleRef.accelerate();      // Calls Sedan's overridden accelerate() — NOT Vehicle's abstract one
        System.out.println();

        // Compare: Motorcycle and Bus also override accelerate() differently
        System.out.println("--- Motorcycle overrides accelerate() differently ---");
        Motorcycle moto = new Motorcycle("Yamaha", "MT-07", 2023, "Black", "Sport");
        Vehicle motoRef = moto;
        motoRef.accelerate(); // Calls Motorcycle's version

        System.out.println();
        System.out.println("--- Bus overrides accelerate() differently ---");
        Bus bus = new Bus("Volvo", "B8R", 2021, "Blue", 60, "Route 42");
        Vehicle busRef = bus;
        busRef.accelerate(); // Calls Bus's version

        // -------------------------------------------------------
        // DEMONSTRATING METHOD OVERLOADING
        // Sedan has THREE versions of accelerate():
        //   1. accelerate()                     — inherited from Vehicle (overridden)
        //   2. accelerate(double kmhIncrease)   — with speed parameter
        //   3. accelerate(double, int gear)     — with speed and gear parameters
        // -------------------------------------------------------
        System.out.println("\n=== METHOD OVERLOADING Demo ===");
        System.out.println("Three versions of accelerate() on the same Sedan object:\n");

        System.out.println("1. accelerate() — no parameters (default 20 km/h increase):");
        mySedan.accelerate();

        System.out.println("\n2. accelerate(double) — with specific speed increase:");
        mySedan.accelerate(35.5); // Overloaded version

        System.out.println("\n3. accelerate(double, int) — with speed and gear:");
        mySedan.accelerate(50.0, 4); // Overloaded version with gear shift

        // -------------------------------------------------------
        // Additional Automobile interface method demos
        // -------------------------------------------------------
        System.out.println("\n=== Automobile Interface Methods ===");
        mySedan.steer("left");
        mySedan.checkSeatbelts();
        mySedan.honk(); // Default interface method

        System.out.println("\n--- Stopping the Sedan ---");
        mySedan.stop();

        // -------------------------------------------------------
        // SportsCar demo
        // -------------------------------------------------------
        System.out.println("\n=== SportsCar Demo ===");
        SportsCar ferrari = new SportsCar("Ferrari", "F8 Tributo", 2023, "Red");
        ferrari.accelerate();           // Overridden from Vehicle
        ferrari.accelerate(80.0);       // Overloaded with speed
        ferrari.activateTurbo();
        System.out.println("Final Speed: " + ferrari.getCurrentSpeedKmh() + " km/h");


    }
}