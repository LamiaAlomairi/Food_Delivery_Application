package com.Food_Delivery_Application.Food_Delivery_Application.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "method")
    String method;

    @Column(name = "amount")
    Double amount;

    @ManyToMany
    @JoinTable(name = "payment_order", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "payment_id"))
    private List<Order> orders;
}
