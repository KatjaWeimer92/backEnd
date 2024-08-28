package de.ait.shop43.customer.entity;

import de.ait.shop43.cart.entity.Cart;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.smartcardio.Card;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="active")
    private boolean active;

    @OneToOne
    private Cart cart;
}
