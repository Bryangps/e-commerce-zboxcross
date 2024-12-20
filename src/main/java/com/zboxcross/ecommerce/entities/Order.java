package com.zboxcross.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import com.zboxcross.ecommerce.entities.enums.OrderStatus;
import com.zboxcross.ecommerce.entities.views.ViewOrder;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "tb_order")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@JsonView(ViewOrder.OrderView.class)
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Integer orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @JsonView(ViewOrder.OrderView.class)
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    @JsonView(ViewOrder.OrderView.class)
    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();

    public Order(Long id, Instant moment, OrderStatus orderStatus, User client){
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null){
            this.orderStatus = orderStatus.getCode();
        }
    }
}
