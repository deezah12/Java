package chapter3;

public class Car {
    private String year;
    private String model;
    private double price;

    public Car(String year, String model, double price) {
        this.year = year;
        this.model = model;
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public double setPrice(double price) {
        if (price > 0) {
           return this.price = price;
        }
        return price;
    }
    public  double getDiscount(double discount){
        return price - (price * discount);
    }
}
