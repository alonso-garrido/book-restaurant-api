package com.boot.bookrestaurantapi.services;

import com.boot.bookrestaurantapi.exceptions.BookingException;
import com.boot.bookrestaurantapi.jsons.CreateRestaurant;
import com.boot.bookrestaurantapi.jsons.RestaurantRest;

import java.util.List;

public interface RestaurantService {
    RestaurantRest getRestaurantById(Long restaurantId) throws BookingException;

    public List<RestaurantRest> getRestaurants() throws BookingException;

    RestaurantRest createRestaurant(CreateRestaurant createRestaurant) throws BookingException;
}
