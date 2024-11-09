package com.zboxcross.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.zboxcross.ecommerce.entities.views.ViewOrder;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@JsonView(ViewOrder.OrderView.class)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    @Setter(AccessLevel.NONE)
    private List<Order> orders = new ArrayList<>();

    public User(Long id, String name){
        this.id = id;
        this.name = name;
    }
}
