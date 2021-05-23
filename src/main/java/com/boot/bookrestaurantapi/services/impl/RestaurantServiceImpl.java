package com.boot.bookrestaurantapi.services.impl;

import com.boot.bookrestaurantapi.entities.Restaurant;
import com.boot.bookrestaurantapi.exceptions.BookingException;
import com.boot.bookrestaurantapi.exceptions.NotFoundException;
import com.boot.bookrestaurantapi.jsons.CreateRestaurant;
import com.boot.bookrestaurantapi.jsons.RestaurantRest;
import com.boot.bookrestaurantapi.repositories.RestaurantRepository;
import com.boot.bookrestaurantapi.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;


    @Override
    public RestaurantRest getRestaurantById(Long restaurantId) throws BookingException {
        return null;
    }

    @Override
    public List<RestaurantRest> getRestaurants() throws BookingException {
        return null;
    }

    @Override
    public RestaurantRest createRestaurant(CreateRestaurant createRestaurant) throws BookingException {
        return null;
    }

    private Restaurant getRestaurantEntity (Long restaurantId) throws BookingException{
        return restaurantRepository.findById(restaurantId).orElseThrow(()-> new NotFoundException("401","Restaurant not found"));
    }
}
