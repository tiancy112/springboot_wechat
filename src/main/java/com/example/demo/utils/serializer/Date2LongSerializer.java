package com.example.demo.utils.serializer;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
/**
 * Date转Long, 解决时间戳末尾多了3个零的问题
 *
 * 使用方法(OrderDTO.java): @JsonSerialize(using = Date2LongSerializer.class)
 *                         private Date createTime;
 * 2017-06-19 00:29
 */
public class Date2LongSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(date.getTime() / 1000);
    }
}