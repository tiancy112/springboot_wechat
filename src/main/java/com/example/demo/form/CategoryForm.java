package com.example.demo.form;

import lombok.Data;

/**
 * 分类 表单验证
 *
 * 2017-07-23 21:43
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /**
     * 类目名字
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;
}

