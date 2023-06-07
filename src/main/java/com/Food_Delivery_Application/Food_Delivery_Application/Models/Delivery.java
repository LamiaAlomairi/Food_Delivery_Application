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
@Table(name = "Delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;

    String address;

    Integer phoneNumber;

    String estimatedDeliveryTime;

    @OneToMany(mappedBy = "delivery")
    @JsonIgnore
    private List<Order> orders;
}
