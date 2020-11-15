package entities;
public class Tractor extends Vehicle{
    private String cylindricalCapacity;

    public Tractor(String brand, String model, String price, String cylindricalCapacity) {
        super(brand, model, price);
        this.cylindricalCapacity = cylindricalCapacity;
    }

    public String getCylindricalCapacity() {
        return cylindricalCapacity;
    }

    public Tractor setCylindricalCapacity(String cylindricalCapacity) {
        this.cylindricalCapacity = cylindricalCapacity;
        return this;
    }

    @Override
    public String toString() {
        return "Tractor{" + super.toString() +
                "cylindricalCapacity='" + cylindricalCapacity + '\'' +
                '}';
    }
}
