package com.example.collections;

import java.util.*;

public class Theatre {
    private final String theatreName;
    //private Collection<Seat> seats = new ArrayList<>();
    private List<Seat> seats = new LinkedList<>();
    //can change the above line to a collection
    //private Collection<Seat> seats = new LinkedList<>();
    //Hash Set - not ordering
    //private Collection<Seat> seats = new HashSet<>();
    //Linked Hash Set - ordered

    //Another way to sort is to use a COMPARATOR
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice() > seat2.getPrice()){
                return -1;
            }else if(seat1.getPrice() < seat2.getPrice()){
                return  1;
            }else{
                return 0;
            }
        }
    };


    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                double price = 12.00;
                if((row < 'D') && (seatNum >=1 && seatNum <= 9)){
                    price = 14;
                }else if((row > 'F') || (seatNum < 4) || (seatNum > 9)){
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestSeat, null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        }else{
            return false;
        }
//by using collections and compareable we no longer need this code.
        //        for(Seat seat : seats){
//            System.out.println(".");
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestSeat = seat;
//                break;
//            }
//        }
//        if(requestSeat == null){
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//
//        return requestSeat.reserve();
    }

    //for testing
    public Collection<Seat> getSeats() {
        return seats;
    }

    //Adding a comparable will make searching in the Collection to be quicker
    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;
        private double price;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }else{
                return false;
            }
        }

        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("reservation of seat " + seatNumber + " cancelled");
                return true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }

}
