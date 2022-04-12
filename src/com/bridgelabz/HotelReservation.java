package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class HotelReservation {

    private Map<String, Hotels> listOfHotels = new HashMap<String, Hotels>();

    public void addHotel(String hotelName, int weekdayRate, int weekendrate, int rating,
                         int rewardCusWeekdayRate, int rewardCusWeekendRate) {
        Hotels hotel = new Hotels(hotelName, weekdayRate, weekendrate, rating, rewardCusWeekdayRate,
                rewardCusWeekendRate);
        listOfHotels.put(hotelName, hotel);
        System.out.println("Hotel " + hotelName + " successfully added!");
    }
}