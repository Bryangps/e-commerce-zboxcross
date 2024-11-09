package com.zboxcross.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zboxcross.ecommerce.entities.pk.OrderItemsPk;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


import java.io.Serializable;

@Entity
@Table(name = "tb_ordem_item")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class OrderItem implements Serializable {

    @EmbeddedId
    @EqualsAndHashCode.Exclude
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private OrderItemsPk id = new OrderItemsPk();
    private Integer quantity;
    private Double price;

    public OrderItem(Order order, Product product, Integer quantity, Double price){
        setOrder(order);
        setProduct(product);
        this.quantity = quantity;
        this.price = price;

    }

    @JsonIgnore
    public Order getOrder(){
        return id.getOrder();
    }

    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }
}
