package chapter6;

public class Customer {
    private  String nameOfVehicle;
    private  String plateNumber;
    private String vehicleColour;

    public Customer(String nameOfVehicle, String plateNumber, String vehicleColour) {
        this.nameOfVehicle = nameOfVehicle;
        this.plateNumber = plateNumber;
        this.vehicleColour = vehicleColour;
    }

    @Override
    public String toString() {
        return "Customer" +
                "nameOfVehicle is: " + nameOfVehicle + '\'' +
                ", plateNumber is: " + plateNumber + '\'' +
                ", vehicleColour is: " + vehicleColour + '\'';
    }
}
