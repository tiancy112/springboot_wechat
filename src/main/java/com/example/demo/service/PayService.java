package com.example.demo.service;

import com.example.demo.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

public interface PayService {

	PayResponse create(OrderDTO orderDTO);

    /**
     * 微信异步通知
     *
     * @param notifyData
     */
    PayResponse notify(String notifyData);

    /**
     * 退款
     *
     * @param orderDTO
     */
    RefundResponse refund(OrderDTO orderDTO);
}
