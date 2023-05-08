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
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    Integer order_id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Restaurant restaurant;

    @ManyToMany
    @JsonIgnore
    private List<Menu> menuItems;

    @OneToOne
    private Delivery delivery;

    @OneToOne
    private Payment payment;
}
