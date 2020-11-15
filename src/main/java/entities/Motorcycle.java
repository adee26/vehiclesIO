package entities;

public class Motorcycle extends Vehicle implements Comparable<Motorcycle>{
    private String topSpeed;
    private String motorcycleShape;

    public Motorcycle(String brand, String model, String price, String topSpeed, String motorcycleShape) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
        this.motorcycleShape = motorcycleShape;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public Motorcycle setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

    public String getMotorcycleShape() {
        return motorcycleShape;
    }

    public Motorcycle setMotorcycleShape(String motorcycleShape) {
        this.motorcycleShape = motorcycleShape;
        return this;
    }

    @Override
    public String toString() {
        return "Motorcycle{" + super.toString() +
                "topSpeed='" + topSpeed + '\'' +
                ", motorcycleShape='" + motorcycleShape + '\'' +
                '}';
    }

    @Override
    public int compareTo(Motorcycle motorcycle) {
        return Integer.parseInt(this.getTopSpeed()) - Integer.parseInt(motorcycle.getTopSpeed());
    }
}
