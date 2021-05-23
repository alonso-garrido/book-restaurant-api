package com.boot.bookrestaurantapi.jsons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRestaurant {
    private String name;
    private String address;
    private String description;
    private String image;
}
