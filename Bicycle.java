package Entity;

public class Bicycle extends Vehicle{

	@SuppressWarnings("unused")
    private int numberOfGears;

    public Bicycle(String licensePlate, String make, String model, int numberOfGears) {
        super(licensePlate, make, model);
        this.numberOfGears = numberOfGears;
    }

}
