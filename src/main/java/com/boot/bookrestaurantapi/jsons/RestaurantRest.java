package com.boot.bookrestaurantapi.jsons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantRest {
    private Long id;
    private String name;
    private String address;
    private String description;
    private String image;
}
