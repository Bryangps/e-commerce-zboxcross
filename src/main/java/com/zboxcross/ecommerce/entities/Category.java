package com.zboxcross.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_category")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    @Setter(AccessLevel.NONE)
    private List<Product> product;

    public Category(Long id, String name){
        this.id = id;
        this.name = name;
    }


}