package entities;

import java.util.ArrayList;

public class Car extends Vehicle implements Comparable<Car>{
    private String topSpeed;
    private CarGearType gearType;
    private CarShape carShape;

    public Car(String brand, String model, String price, String topSpeed, CarGearType gearType, CarShape carShape) {
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

    public CarGearType getGearType() {
        return gearType;
    }

    public Car setGearType(CarGearType gearType) {
        this.gearType = gearType;
        return this;
    }

    public CarShape getCarShape() {
        return carShape;
    }

    public Car setCarShape(CarShape carShape) {
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


    @Override
    public int compareTo(Car car) {
        return Integer.parseInt(this.getPrice()) - Integer.parseInt(car.getPrice());
    }
}
