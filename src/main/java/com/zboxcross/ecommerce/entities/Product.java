package com.zboxcross.ecommerce.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_product")
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;
    private String name;
    private Double price;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(Long id, String name, Double price, Category category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
