package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    SUCCESS(0, "鎴愬姛"),

    PARAM_ERROR(1, "鍙傛暟涓嶆纭"),
    PRODUCT_NOT_EXIST(10, "鍟嗗搧涓嶅瓨鍦"),

    PRODUCT_STOCK_ERROR(11, "鍟嗗搧搴撳瓨涓嶆纭"),
    ORDER_NOT_EXIST(12, "璁㈠崟涓嶅瓨鍦"),

    ORDERDETAIL_NOT_EXIST(13, "璁㈠崟涓嶅瓨鍦"),
    ORDER_STATUS_ERROR(14, "璁㈠崟涓嶅瓨鍦"),

    ORDER_UPDATE_FAIL(15, "璁㈠崟鏇存柊澶辫触"),

    ORDER_DETAIL_EMPTY(16, "璁㈠崟璇︽儏涓虹┖"),

    ORDER_PAY_STATUS_ERROR(17, "璁㈠崟涓嶅瓨鍦"),
    CART_EMPTY(18, "璐墿杞︿负绌"),

    ORDER_OWNER_ERROR(19, "璇ヨ鍗曚笉灞炰簬褰撳墠鐢ㄦ埛"),

    WECHAT_MP_ERROR(20, "寰俊鍏紬璐﹀彿鏂归潰閿欒"),

    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(21, "寰俊鏀粯寮傛閫氱煡閲戦鏍￠獙涓嶉�杩"),
    ORDER_CANCEL_SUCCESS(22, "璁㈠崟鍙栨秷鎴愬姛"),
    ORDER_FINISH_SUCCESS(23, "璁㈠崟瀹岀粨鎴愬姛"),
    PRODUCT_STATUS_ERROR(24, "鍟嗗搧鐘舵�涓嶆纭"),

    LOGIN_FAIL(25, "鐧诲綍澶辫触, 鐧诲綍淇℃伅涓嶆纭"),
    LOGOUT_SUCCESS(26, "鐧诲嚭鎴愬姛"),
    ;
    private Integer code;
    private String message;
    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}