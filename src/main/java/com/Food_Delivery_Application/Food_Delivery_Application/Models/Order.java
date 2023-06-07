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
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "delivery_id", referencedColumnName = "id")
    private Delivery delivery;

    @ManyToMany
    @JsonIgnore
    private List<Payment> payments;

}
