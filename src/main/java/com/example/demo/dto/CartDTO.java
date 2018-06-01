package com.example.demo.dto;

import lombok.Data;

/**
 * 购物车 数据传输对象(Data Transfer Object)
 *
 * 2017-06-11 19:37
 */
@Data
public class CartDTO {

    /** 商品id */
    private String productId;

    /** 数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}