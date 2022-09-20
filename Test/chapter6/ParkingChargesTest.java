package chapter6;

class ParkingChargesTest {
    public static void main(String[] args) {

        Customer customer = new Customer("toyota","34DEG56","blue");
        ParkingCharges parkingCharges = new ParkingCharges(17);
        System.out.println("Deezah's parking System");
        System.out.println(customer);
        System.out.println(parkingCharges.getHoursParked());
        System.out.println(parkingCharges.charges(17,2));
    }

}