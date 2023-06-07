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
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;
    String address;
    String phoneNumber;
    String email;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Order> orders;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Rating> ratings;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Review> reviews;
}
