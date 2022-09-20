package chapter4;

public class Ticket {
    private int ticketId;
    private String passengerName;
    private String destination;

    private static String airline = "Unicorn";

    public Ticket(){}

    public Ticket(int ticketId){
        this.ticketId = ticketId;
    }

    public Ticket(int ticketId, String passenger){
        this.ticketId = ticketId;
        passengerName = passenger;
    }

    public int getTicketId(){
        return ticketId;
    }

    public void setTicketId(int id){
        this.ticketId = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public static String getAirline() {
        return airline;
    }

    public static void setAirline(String airline) {
        Ticket.airline = airline;
    }
}
