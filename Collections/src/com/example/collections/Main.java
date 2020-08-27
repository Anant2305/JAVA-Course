package com.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
	    //theatre.getSeats();
	    if(theatre.reserveSeat("D12")) {
            System.out.println("Please Pay");
        }else{
            System.out.println("Sorry, Taken");
        }

        if(theatre.reserveSeat("B10")) {
            System.out.println("Please Pay");
        }else {
            System.out.println("Sorry, Taken");
        }
        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse((reverseSeats));
        printList(reverseSeats);
//
//        seatCopy.get(1).reserve();
//        if(theatre.reserveSeat("A02")) {
//            System.out.println("Pleas pay");
//        }else{
//            System.out.println("Seat Resvered Already");
//        }
//        //Colelction allows you to reverse the list
//        Collections.reverse(seatCopy);
//        System.out.println("printing reverse seat copy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seat");
//        printList(theatre.seats);
//
//        //Collection allows you to shuffle the list in a random order
//        Collections.shuffle(seatCopy);
//        System.out.println("printing shuffle copy");
//
//        //Collection aloows you to get the min and max values
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("min is " + minSeat.getSeatNumber());
//        System.out.println("max is " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("printing sorted SeatCopy");
//        printList(seatCopy);


        //Testing Comparator
        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("========================================================");
    }

    //Create you own sorts
    //This Swaps position of the List and you can swap the index position.
//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for(int i=0; i<list.size()-1; i++){
//            for(int j=i+1; j<list.size(); j++){
//                if(list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
