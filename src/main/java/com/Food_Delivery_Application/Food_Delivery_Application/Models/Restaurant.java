package com.Food_Delivery_Application.Food_Delivery_Application.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    Integer id;

    String name;
    String location;

    Integer phoneNumber;

    @OneToMany(mappedBy = "restaurant")
    @JsonIgnore
    private List<Rating> ratings;

    @OneToMany(mappedBy = "restaurant")
    @JsonIgnore
    private List<Menu> menus;

    @OneToMany(mappedBy = "restaurant")
    @JsonIgnore
    private List<Review> reviews;

    @OneToMany(mappedBy = "restaurant")
    @JsonIgnore
    private List<Order> orders;

    @ManyToOne
    @JoinColumn(name = "promotion_id", referencedColumnName = "id")
    private Promotion promotion;
}
