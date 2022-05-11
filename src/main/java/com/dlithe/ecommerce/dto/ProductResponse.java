package com.dlithe.ecommerce.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.File;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductResponse {

    private String productName;
    private String productId;
    private File productImage;
}
