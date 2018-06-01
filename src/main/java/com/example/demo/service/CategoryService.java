package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.ProductCategory;

/**
 * 类目
 *
 * 2017-05-09 10:12
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
