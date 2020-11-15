package entities;

public class Vehicle {
    private String brand;
    private String model;
    private String price;

    public Vehicle(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Vehicle setPrice(String price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' ;
    }
}
