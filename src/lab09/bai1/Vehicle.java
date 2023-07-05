package lab09.bai1;

public class Vehicle {
    public Vehicle(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public Vehicle(){

    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String maker;
    public String model;

    @Override
    public String toString() {
        return "Vehicle{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public double price;
}
