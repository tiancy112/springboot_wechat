package com.example.demo.bean;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 卖家信息表(登录后台使用, 卖家登录之后可能直接采用微信扫码登录，不使用账号密码)
 *
 * 2017-07-23 23:02
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}