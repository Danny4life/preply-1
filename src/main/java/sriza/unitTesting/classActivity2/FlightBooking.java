package sriza.unitTesting.classActivity2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightBooking {
    private final Map<String, Set<String>> flightPassengers; // Stores flight numbers and their passenger
    private final Map<String, Integer> flightCapacity; // Stores flight numbers and maximum seats

    public FlightBooking() {
        this.flightPassengers = new HashMap<>();
        this.flightCapacity = new HashMap<>();
    }

    // Add a flight with specific seat capacity
    public void addFlight(String flightNumber, int capacity){
        flightPassengers.put(flightNumber, new HashSet<>());
        flightCapacity.put(flightNumber, capacity);

    }

    String name = "john";

    // Book a ticket for passenger
    public boolean bookTicket(String passengerName, String flightNumber){

        if(!flightPassengers.containsKey(flightNumber)){
            throw new IllegalStateException("Flight does not exists");
        }

        Set<String> passengers = flightPassengers.get(flightNumber);

        int maxSeats = flightCapacity.get(flightNumber);

        if(passengers.size() >= maxSeats){
            return false; // Flight is filled up

        }

        return passengers.add(passengerName); // return true if booking is successful

    }

    // cancel a ticket for a passenger
    public boolean cancelTicket(String passengerName, String flightNumber){
        if(!flightPassengers.containsKey(flightNumber)){
            throw new IllegalStateException("Flight does not exits");
        }

        return flightPassengers.get(flightNumber).remove(passengerName);

    }

    // check if seats are available for a flight
    public boolean isSeatAvailable(String flightNumber){
        if(!flightPassengers.containsKey(flightNumber)){
            throw new IllegalStateException("Flight does not exists");
        }

        return flightPassengers.get(flightNumber).size() < flightCapacity.get(flightNumber);

    }
}
