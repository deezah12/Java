package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    private Ticket bankeTicket;
    private Ticket jamesTicket;
    private Ticket temiTicket;

    @BeforeEach
    void setUp(){
        bankeTicket = new Ticket();
        bankeTicket.setTicketId(1);
    }

    @Test
    public void getTicketId(){
        assertEquals(1, bankeTicket.getTicketId());
    }

    @Test
    public void createTicketWithParameters(){
        jamesTicket = new Ticket(2);
        assertEquals(2, jamesTicket.getTicketId());
    }

    @Test
    public void createTicketWithPassengerName(){
        temiTicket = new Ticket(3, "Temi Escorter");
        assertEquals(3, temiTicket.getTicketId());
        assertEquals("Temi Escorter", temiTicket.getPassengerName());
    }

    @Test
    void getAirlineName(){
        assertEquals("Unicorn", Ticket.getAirline());
        Ticket.setAirline("Cohort12");
        assertEquals("Cohort12", Ticket.getAirline());
    }
}