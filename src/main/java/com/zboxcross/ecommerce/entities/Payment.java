package com.zboxcross.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zboxcross.ecommerce.entities.enums.PaymentMethod;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;


@Entity
@Table(name = "tb_payment")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;
    private Instant paymentDate;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Integer paymentMethod;

    @JsonIgnore
    @OneToOne
    @MapsId
    private Order order;

    public Payment(Long id, Instant paymentDate, PaymentMethod paymentMethod, Order order){
        this.id = id;
        this.paymentDate = paymentDate;
        this.order = order;
        setPaymentMethod(paymentMethod);
    }

    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.valueOf(paymentMethod);
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod.getCode();
    }
}
