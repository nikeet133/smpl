package com.dlithe.ecommerce.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductD {

    private String name;
    private String description;
    private String price;


private ProductReview productReview;

}
