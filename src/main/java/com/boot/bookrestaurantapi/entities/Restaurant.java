package com.boot.bookrestaurantapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "restaurants")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name ="address")
    private String address;
    @Column(name ="description")
    private String description;
    @Column(name ="image")
    private String image;
}
