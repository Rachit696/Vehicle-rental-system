package Entity;

public class Car extends Vehicle{
    @SuppressWarnings("unused")
    private int numberOfSeats;

    public Car(String licensePlate, String make, String model, int numberOfSeats) {
        super(licensePlate, make, model);
        this.numberOfSeats = numberOfSeats;
    }

}
