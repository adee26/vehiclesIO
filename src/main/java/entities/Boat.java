package entities;

public class Boat extends Vehicle{
    private String horsePower;

    public Boat(String brand, String model, String price, String horsePower) {
        super(brand, model, price);
        this.horsePower = horsePower;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public Boat setHorsePower(String horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    @Override
    public String toString() {
        return "Boat{" + super.toString() +
                "horsePower='" + horsePower + '\'' +
                '}';
    }
}
