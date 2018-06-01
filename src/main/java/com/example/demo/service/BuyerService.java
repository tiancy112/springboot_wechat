package com.example.demo.service;

import com.example.demo.dto.OrderDTO;

/**
 * 买家
 *
 * 2017-06-22 00:11
 */
public interface BuyerService {

    /**
     * 查询一个订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
