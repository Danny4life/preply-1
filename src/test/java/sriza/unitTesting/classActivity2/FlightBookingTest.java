package sriza.unitTesting.classActivity2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightBookingTest {

    private FlightBooking flightBooking;

    @BeforeEach
    void setUp(){
        flightBooking = new FlightBooking();
        flightBooking.addFlight("FL123", 2);  // Flight with 2 seats
    }


    @Test
    void testBookTicketSuccessfully() {

        assertTrue(flightBooking.bookTicket("Alice", "FL123"), "Alice should be able to book a ticket");
        assertTrue(flightBooking.bookTicket("Bob", "FL123"), "Bob should be able to book a ticket");

    }

    @Test
    void testBookTicketFailsWhenFull(){

    }

    @Test
    void testCancelTicketSuccessfully() {
    }

    @Test
    void testIsSeatAvailable() {
    }
}