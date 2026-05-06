public interface Automobile {
    int max_passengers = 4;
    double max_speed = 200.0;

    void steer(String direction);
    void shiftGear(int gear);
    void activateAirbags();
    boolean checkSeatbelts();

    default void honk(){
        System.out.println("Beep! Beep!");

    }
    static String getType(){
        return "Four wheeled motor vehicle";
    }
}
