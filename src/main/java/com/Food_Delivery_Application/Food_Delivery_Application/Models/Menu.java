package com.Food_Delivery_Application.Food_Delivery_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "MenuItem")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    String description;

    Double price;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Restaurant restaurant;
}
