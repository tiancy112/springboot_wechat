package com.example.demo.converter;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.example.demo.bean.OrderMaster;
import com.example.demo.dto.OrderDTO;
import java.util.stream.Collectors;

/**
 * OrderMaster转OrderDTO转换器
 *
 * 2017-06-11 22:02
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}
