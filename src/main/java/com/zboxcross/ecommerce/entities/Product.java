package com.zboxcross.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonView;
import com.zboxcross.ecommerce.entities.views.ViewOrder;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
    @JsonView(ViewOrder.OrderView.class)
    private Long id;
    @JsonView(ViewOrder.OrderView.class)
    private String name;
    @JsonView(ViewOrder.OrderView.class)
    private Double price;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private Stock stock;

    @JsonView(ViewOrder.OrderView.class)
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "id.product")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Set<OrderItem> items = new HashSet<>();

    public Product(Long id, String name, Double price, Category category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
