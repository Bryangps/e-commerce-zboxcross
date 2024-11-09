package com.zboxcross.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_stock")
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor

public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant registrationDate;
    private Long total_qty;
    private Long remaining_qty;
    private Long output_qty;

    @JsonIgnore
    @OneToOne
    @MapsId
    private Product product;


    public Stock(Long id, Instant registrationDate, Long total_qty, Long remaining_qty, Long output_qty, Product product){
        this.id = id;
        this.registrationDate = registrationDate;
        this.total_qty = total_qty;
        this.remaining_qty = remaining_qty;
        this.output_qty = output_qty;
        this.product = product;
    }

}
