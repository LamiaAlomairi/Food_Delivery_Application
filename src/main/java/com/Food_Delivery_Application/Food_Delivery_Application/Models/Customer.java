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
    @Column(name = "customer_id")
    Integer customer_id;

    @Column(name = "customer_name")
    String customer_name;

    @Column(name = "customer_address")
    String customer_address;

    @Column(name = "customer_phone_number")
    Integer customer_number;

    @Column(name = "customer_email")
    String customer_email;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Order> orders;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Rating> ratings;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Review> reviews;

    @ManyToOne
    private Restaurant restaurant;
}
