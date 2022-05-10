package com.dlithe.ecommerce.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ProductReview {

    private String Name;
    private String review;
    private String rating;

}
