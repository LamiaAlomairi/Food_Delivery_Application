package com.Food_Delivery_Application.Food_Delivery_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Integer rating;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Restaurant restaurant;
}
