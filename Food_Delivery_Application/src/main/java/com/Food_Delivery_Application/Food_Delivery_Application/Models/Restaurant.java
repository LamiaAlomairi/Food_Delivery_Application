package com.Food_Delivery_Application.Food_Delivery_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    Integer restaurant_id;

    @Column(name = "restaurant_name")
    String restaurant_name;

    @Column(name = "restaurant_location")
    String restaurant_location;

    @Column(name = "restaurant_phone_number")
    Integer restaurant_number;

}
