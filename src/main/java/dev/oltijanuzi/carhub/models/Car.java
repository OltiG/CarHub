package dev.oltijanuzi.carhub.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String brand;

    @Column(nullable = false, length = 50)
    private String model;

    @Column(nullable = false, length = 4)
    private int year;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false, length = 10)
    private double price;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private boolean isAvailable;

    @Column(nullable = false, length = 100)
    private double power;

    @Column(nullable = false)
    private int seats;

    @Column(nullable = false, length = 50)
    private String gearType;

    @Column(nullable = false, length = 50)
    private int speed;

    @Column(nullable = false, length = 50)
    private String fuelType;

}
