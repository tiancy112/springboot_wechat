package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum implements CodeEnum {

	NEW(0, "新订单"),
	FINISHED(1, "完结"),
	CANCEL(2, "已取消"),;
	
	
	private OrderStatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}


	private Integer code;


	private String message;


}
