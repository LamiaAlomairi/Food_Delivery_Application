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
    @Column(name = "delivery_id")
    Integer delivery_id;

    @Column(name = "delivery_person_name")
    String delivery_person_name;

    @Column(name = "delivery_address")
    String delivery_address;

    @Column(name = "delivery_person_number")
    Integer delivery_person_number;

    @Column(name = "estimatedDeliveryTime")
    String estimatedDeliveryTime;

    @OneToMany(mappedBy = "delivery")
    @JsonIgnore
    private List<Order> orders;
}
