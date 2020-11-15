package entities;

public class Car extends Vehicle{
    private String topSpeed;
    private String gearType;
    private String carShape;

    public Car(String brand, String model, String price, String topSpeed, String gearType, String carShape) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
        this.gearType = gearType;
        this.carShape = carShape;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public Car setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

    public String getGearType() {
        return gearType;
    }

    public Car setGearType(String gearType) {
        this.gearType = gearType;
        return this;
    }

    public String getCarShape() {
        return carShape;
    }

    public Car setCarShape(String carShape) {
        this.carShape = carShape;
        return this;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "topSpeed='" + topSpeed + '\'' +
                ", gearType='" + gearType + '\'' +
                ", carShape='" + carShape + '\'' +
                '}';
    }
}
