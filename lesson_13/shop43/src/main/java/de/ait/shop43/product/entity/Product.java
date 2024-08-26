package de.ait.shop43.product.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode
@ToString
@Setter
@Getter

@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="price")
    private BigDecimal price;

    @Column(name="active")
    private boolean active;

}
