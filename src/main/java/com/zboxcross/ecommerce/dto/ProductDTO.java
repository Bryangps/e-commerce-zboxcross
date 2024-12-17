package com.zboxcross.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zboxcross.ecommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;

@Getter
public class ProductDTO {

    private Long id;
    @NotBlank(message = "Campo requerido")
    private String name;

    @Positive(message = "O preço deve ser positivo")
    private Double price;

    private String imgUrl;

    @JsonCreator
    public ProductDTO(@JsonProperty("id") Long id, @JsonProperty("name") String name,
                      @JsonProperty("price") Double price, @JsonProperty("imgUrl") String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }
}
